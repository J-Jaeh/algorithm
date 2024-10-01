class Solution {
    boolean[] isPrime;
    int count;
    public int solution(int[] nums) {
        // 3개를 더해서 소수를 판별하는 로직 을 만들어보슈 ,..,!
        // 순열과 조합을 구분하기 .. !

        //소수 채우 50000
        isPrime = new boolean[3001];
        isPrime[0]=true;
        isPrime[1]=true;
        int s = 2;
        for(; s<Math.sqrt(3001);s++){
            if(!isPrime[s]){
                int start = s*s;
                for(;start<3001;start+=s){
                    isPrime[start] = true;
                }
            }
        }
        count=0;


        for(int i = 0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for (int k=j;k<nums.length;k++){
                    int n = nums[i]+nums[j]+nums[k];
                    if(!isPrime[n] && i != j && j != k){
                        count++;
                    }
                }
            }

        }

        // dfs
        return count;
    }
}