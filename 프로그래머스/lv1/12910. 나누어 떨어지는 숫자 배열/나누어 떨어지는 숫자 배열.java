import java.util.ArrayList;
import java.util.Comparator;


class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i : arr) {
            if(i%divisor==0){
                answer.add(i);
            }
        }
        
        if(answer.size()<1){
            answer.add(-1);
        }
        //Arrays.sort(answer); ㅠㅠ 
        answer.sort(Comparator.naturalOrder());

        return answer;
    }
}