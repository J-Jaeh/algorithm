class Solution {
    public int solution(int n) {

        int[] nums = new int[n];
        nums[0] = 1;
        for (int i = 1 ; i<n;i++){
            nums[i] = nums[i-1]+i; // 누적합
        }
        //투포인터로 거리 조절 ?
        int lp=0;
        int rp=1;
        int count=0;
        while(rp<n){
            int temp = nums[rp] - nums[lp];
            if (temp == n){
                count++;
                rp++;
                lp++;
            }else if ( temp > n){
                lp++;
            }else{
                rp++;
            }
        }

        return count+1;
    }
}