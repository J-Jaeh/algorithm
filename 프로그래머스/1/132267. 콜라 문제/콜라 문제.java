class Solution {
   public  int solution(int a, int b, int n) {
        //a개가져가면 콜라 b개를 줌 이때 n개가져가면 ?
        //b<a<=n
        int answer = 0;
        while (a<=n){
            int remain = n%a;
            int returns = (n/a)*b;
            answer+=returns;
            n=remain+returns;
        }
        return answer;
    }
}