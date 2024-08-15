import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] charArray = s.toCharArray();
        if (charArray[0]==')') return false;

        Deque<Character> stack = new ArrayDeque<>();
        for (char c : charArray) {
            if (c =='('){
                stack.add(c);
            }else {
                stack.pollLast();
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}
