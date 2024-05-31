class Solution {
      public boolean find132pattern(int[] nums) {
        //1 <- 3 <- 2
        Stack<Integer> stack = new Stack<>();
        int val = Integer.MIN_VALUE;
        for(int i = nums.length-1;i>=0;i--){

            if(nums[i]<val) return true;

            while (!stack.empty() && stack.peek()<nums[i]) {
                val = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}