class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /// stream 길이 제한이 있는듯?  이건 레알임 ..!
        // List<Integer> listNums = Arrays.stream(nums).boxed().sorted(Integer::compareTo).toList();
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        int size = nums.length;
        for (int i = 0; i < size - 2; i++) {

            if(i>0 && nums[i] == nums[i-1]) continue;

            int lp = i + 1;
            int rp = size - 1;
            while(lp<rp) {
                int sum = nums[i] + nums[lp] + nums[rp];
                if (sum == 0) {
                    answer.add(Arrays.asList(nums[i], nums[lp],nums[rp]));

                    while (lp<rp && nums[lp] == nums[lp+1]) {
                        lp++;
                    }
                    while (lp<rp && nums[rp] == nums[rp-1]){
                        rp--;
                    }
                    lp++;
                    rp--;
                } else if (sum < 0) lp++;
                else rp--;
            }

        }
        return answer;
    }
}