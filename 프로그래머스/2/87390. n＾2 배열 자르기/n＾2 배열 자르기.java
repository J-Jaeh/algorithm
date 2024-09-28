class Solution {
 public static long[]  solution(int n, long left, long right) {
      
        long[] answer = new long[(int) (right-left+1)];
        long s = left/n; // 1줄은 0부터시작

        for(int i =0;i< (right-left+1);i++){
            long num = (i+left%n) % n ;// 0 1 2 3 4 5...
            if(num<s+1){
                answer[i]=s+1;
                continue;
            }
            if (num +1  == n){
                s++;
            }
            answer[i]=num+1;
        }
     
        return answer;
    }
}