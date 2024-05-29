class Solution {
        public int climbStairs(int n) {
            int[] dp = new int[n+1];
            // 1 과 2를 기록 .. 합산 ?

            if (n ==1) return 1;
            if (n ==2) return 2;
            dp[2] =2;
            dp[3] =3;

            for(int i=4;i<n+1;i++){
                dp[i]=dp[i-2] + dp[i-1];
            }
            return dp[n];
        }
}