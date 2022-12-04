import java.util.*;

class Solution {
    
    public Object[] solution(int n, int[] numlist) {
        ArrayList<Integer> number = new ArrayList();

        for(int num : numlist){
            if(num%n==0){
                number.add(num);
            }
        }
        return number.toArray();
    }
}