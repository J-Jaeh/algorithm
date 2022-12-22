import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int solution(int[] numbers) {
        int answer =0;
        ArrayList<Integer> number = new ArrayList<>();
        for (int i : numbers) {
            number.add(i);
        }

        HashSet<Integer> allNumber = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        
        HashSet<Integer> comparNumber = new HashSet<>(number);

        allNumber.removeAll(comparNumber);

        ArrayList<Integer> answers =new ArrayList<>(allNumber);

        for (int i = 0; i < answers.size(); i++) {  //for each 돌릴라고 했는데 자료형이 불일치해서 실패..1
            answer += answers.get(i);
        }
        
        return answer;
    }
}