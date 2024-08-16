import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        //스택?
        Deque<Character> stacks = new ArrayDeque<>();
        char[] c = s.toCharArray();
        for(char x:c){
            if (!stacks.isEmpty() && stacks.peekLast()==x){
                stacks.pollLast();
            }else{
                stacks.add(x);
            }
            // System.out.println(stacks.toString());
        }
        if(stacks.isEmpty()){
            return 1;
        }   
        return 0;
    }
}