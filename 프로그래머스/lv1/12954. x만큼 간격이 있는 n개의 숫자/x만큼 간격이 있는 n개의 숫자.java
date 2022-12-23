import java.util.ArrayList;

class Solution {
    public ArrayList<Long> solution(int x, int n) {
        ArrayList<Long> answer = new ArrayList<>();
        int count = 0 ;
        for(Long i =(long)x;count<n;i+=x){
            answer.add(i);
            count++;
        }

        return answer;
    }
}