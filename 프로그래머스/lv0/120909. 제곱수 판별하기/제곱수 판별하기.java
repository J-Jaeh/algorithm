class Solution {
    public int solution(int n) {
        int answer = 2;
        for(int i =0;i<n/2+1;i++){
            long compareNum = i*i;
            if(compareNum ==n){
                 answer--;
            }
        }
        return answer;
    }
}