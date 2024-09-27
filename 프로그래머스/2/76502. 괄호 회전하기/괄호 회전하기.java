import java.util.*;

class Solution {
    public int solution(String s) {
    // {()} -> ()}{ ->)}{( ->}{()  그니까 모두 불가야 !
    // 근데 쌩으로 해봐도 좋을듯 ?
        int answer=0;
        char[] charArray = s.toCharArray();
        List<Character> inputChar = new ArrayList<>();
        for (char c : charArray) {
            inputChar.add(c);
        }
        int count=0;
        while (count<charArray.length){
            if(check(inputChar)){
                answer++;
            }
            Character temp = inputChar.get(0);
            inputChar.remove(0);
            inputChar.add(temp);
            count++;
        }
        return answer;
    }

    private boolean check(List<Character> input){
        Character c = input.get(0);
        if(c == ']' ||c == ')' ||c == '}' ){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for (Character character : input) {
            if (character == '[' || character == '('||character == '{' ){
                st.push(character);
            }else{
                   if(st.empty()){
                    return false;
                }
                if(character == ']' && st.peek()=='['){
                    st.pop();
                    continue;
                }
                if(character == '}' && st.peek()=='{'){
                    st.pop();
                    continue;
                }
                if(character == ')' && st.peek()=='('){
                    st.pop();
                    continue;
                }
                return false;
            }
        }
        return st.empty();
    }
}