class Solution {
        public int reverse(int x) {
            
            if (x==0 )return 0;
            boolean flag = false;

            if (x<0){
                if (x == Integer.MIN_VALUE) {
                return 0;
            }
                x*=(-1);
                flag=true;
                
            }
            StringBuilder answer = new StringBuilder();
            while (x!=0){
                int temp = x%10;
                answer.append(temp);
                x/=10;
            }
            String reverse=answer.toString();
            Long ans = Long.parseLong(reverse);
            int max = Integer.MAX_VALUE;
            if (ans>max) return 0;
            
            if (flag) ans*=(-1);
            
            return Math.toIntExact(ans);
        }

}