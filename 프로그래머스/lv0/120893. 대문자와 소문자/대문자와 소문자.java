class Solution {
    public StringBuffer solution(String my_string) {
        char[] stringToChar = my_string.toCharArray();

        StringBuffer answer = new StringBuffer();

        for (char c : stringToChar) {
            if(c<91){
                answer.append((char)(c+32));
            }
            else{
                answer.append((char)(c-32));
            }
        }

        return answer;
    }
}