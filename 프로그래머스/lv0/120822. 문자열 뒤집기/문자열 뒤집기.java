class Solution {
   public StringBuffer solution(String my_string) {
        StringBuffer answer = new StringBuffer();
        
        char[] charArray = my_string.toCharArray();

        for(int i = charArray.length-1 ;i>=0;i--){
            answer.append(charArray[i]);
        }

        return answer;
    }
}
