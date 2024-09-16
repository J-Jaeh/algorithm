class Solution {
         ///  1칸씩 가는 경우를 대비 ->
        //  1 2 3 4 5 6 7
        //1 1 1 1 1
        //2 1 2 3 5 8 13 21 
        public long solution(int n) {
            if(n==1) return 1;
            if(n==2) return 2;
            int f_v=1;
            int s_v=2;
            for(int i =3;i<=n;i++){
                int temp = f_v + s_v;
                f_v=s_v;
                s_v=temp%1234567;
            }
            return s_v;
        }
   
}