class Solution {
   public long solution(int a, int b) {
        if(a==b){
            return a;
        }
        int maxValue = Math.max(a,b);
        int minValue = Math.min(a,b);
        long answer = 0;
        
        for (int i = minValue;i<maxValue+1;i++){
            answer+=i;     
        }
        return answer;
    }
}