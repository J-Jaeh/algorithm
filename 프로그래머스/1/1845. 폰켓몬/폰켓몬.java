import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

class Solution {
     public int solution(int[] nums) {
        //nums 길이의 절반
        int halfLen = nums.length/2;
        Set numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        int setSize = numSet.size();
         
        return Math.min(halfLen,setSize);

    }
}