import java.util.LinkedList;
import java.util.List;

class Solution {
  public LinkedList<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new LinkedList<>();
      int count = 0;
        for (int i : arr) {
            for (int i1 : delete_list) {
                if (i == i1){
                    count++;
                }
                }
            if(count==0){
                answer.add(i);
            }
            count=0;
            }
        return (LinkedList<Integer>) answer;
    }
}