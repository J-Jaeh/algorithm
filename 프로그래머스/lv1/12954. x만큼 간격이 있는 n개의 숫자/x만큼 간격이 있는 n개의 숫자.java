import java.util.ArrayList;

class Solution {
    public ArrayList<Long> solution(int x, int n) {
        ArrayList<Long> answer = new ArrayList<>();
        int count = 0 ;
        
        for(long i =x;count<n;i+=x){
            answer.add(i);
            count++;
        }

        return answer;
    }
}