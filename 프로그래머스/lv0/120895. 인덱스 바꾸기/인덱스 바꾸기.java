class Solution {
    public StringBuffer solution(String my_string, int num1, int num2) {
        StringBuffer answer = new StringBuffer();
        
        char[] newMy_string = my_string.toCharArray();
        
        char changeNum1 = newMy_string[num1];
        char changeNum2 = newMy_string[num2];
        
        newMy_string[num1] = changeNum2;
        newMy_string[num2] = changeNum1;

        for (char c : newMy_string) {
            answer.append(c);    
        }
        
        return answer; 
    }
}