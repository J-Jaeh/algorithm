import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
        public int[] solution(int []arr) {

            Deque<Integer> stacks = new ArrayDeque<>();
            int i =0;
            stacks.add(arr[i++]);
            for (;i<arr.length;i++) {
                 if (stacks.peekLast() == arr[i]){
                    continue;
                }
                stacks.add(arr[i]);
            }

            return stacks.stream().mapToInt(Integer::intValue).toArray();
        }
}
