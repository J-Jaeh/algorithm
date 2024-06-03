class Solution {
    public int subarraySum(int[] nums, int k) {
        //하위 배열의 합은 연속된  배열임... 
        // [1,2,3] -> [1,3,6] 
        
        if(nums.length ==1 && nums[0]==k) return 1;
        
        int[] pSum = new int[nums.length];
        pSum[0]=nums[0];
        
        int answer=0;
        
        if (nums[0] == k) answer ++; 
        
        
        for (int i = 1; i < pSum.length; i++) {
            pSum[i]=nums[i]+pSum[i-1];
            if(pSum[i]==k) answer++;
        }

        for (int i = 0; i < pSum.length; i++) {
            for (int j = i+1; j < pSum.length; j++) {
                if (i ==j ) continue;
                int temp = pSum[j]-pSum[i];
                if(temp == k) answer++;
            }
        }
        return answer;
    }
}