class Solution {
        public int solution(int[] numbers, int target) {
            return recur(0,target,0,numbers.length,numbers);
         }
         
         private int recur(int i,int target,int temp,int stop,int[] nums){
            if(i==stop){
                if (temp==target){
                    return 1;
                }else return 0;
            }
            
            int p_sum=recur(i+1,target,temp+nums[i],stop,nums);
            int m_sum=recur(i+1,target,temp-nums[i],stop,nums);
            return p_sum+m_sum;
         }
}