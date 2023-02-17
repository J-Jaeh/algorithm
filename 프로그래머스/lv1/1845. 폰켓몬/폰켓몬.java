import java.util.HashSet;

class Solution {
     public int solution(int[] nums) {
         
        int maxSize = nums.length / 2;

        HashSet<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            hashSet.add(num);
        }
        
        int minSize = hashSet.size();

        if (maxSize <= minSize) {
            return maxSize;
        } else {
            return  minSize;
        }
    }
}