class Solution {
    public boolean isValid(String s) {
    char[] s_to_char = s.toCharArray();
    char check_valid =s_to_char[0];
    if(!check_valid(check_valid)) return false;
        
    Stack<Character> stack = new Stack<>();
    stack.push(check_valid);
    for(int i =1;i< s_to_char.length;i++){
        char temp =s_to_char[i];
        if (check_valid(temp)){
            stack.push(temp);
        }else{
            temp =change_char(temp);
            if(stack.empty()) return false;
            if(stack.pop() != temp) return  false;
        }
    }
        return stack.empty();
    }
    
   private boolean check_valid(char check_valid){
        if(check_valid == ')' || check_valid == '}' || check_valid == ']') return false;
        return true;
    }
   private char change_char(char temp){
        switch(temp){
            case ']':
                return '[';
            case '}':
                return '{';
            case ')':
                return '(';    
        }
        return ' ';
   }
}
