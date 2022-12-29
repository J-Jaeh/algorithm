import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<Integer> solution(int[] array, int[][] commands) {

        ArrayList<Integer> answer = new ArrayList<>();
       
        for (int[] command : commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];

            int[] newList = Arrays.copyOfRange(array,i-1,j);
            
            Arrays.sort(newList);
            
            answer.add(newList[k-1]);

        }

        
        return answer;
    }
}