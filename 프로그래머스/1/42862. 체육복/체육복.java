import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 도난당한 학생과 여벌이 있는 학생을 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 도난당했지만 여벌이 있는 학생들을 처리 (교집합 제거)
        List<Integer> lostList = Arrays.stream(lost)
                .filter(l -> !IntStream.of(reserve).anyMatch(r -> r == l))
                .boxed()
                .collect(Collectors.toList());
        List<Integer> reserveList = Arrays.stream(reserve)
                .filter(r -> !IntStream.of(lost).anyMatch(l -> l == r))
                .boxed()
                .collect(Collectors.toList());

        // 여벌 체육복을 빌려주기
        for (int r : reserveList) {
            if (lostList.contains(r - 1)) {
                lostList.remove(Integer.valueOf(r - 1));
            } else if (lostList.contains(r + 1)) {
                lostList.remove(Integer.valueOf(r + 1));
            }
        }

        // 전체 학생에서 빌리지 못한 학생 수를 뺀다
        return n - lostList.size();
    }
}
