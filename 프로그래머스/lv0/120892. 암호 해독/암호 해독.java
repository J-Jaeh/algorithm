class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int count =0;
        char[] cipherToChar = cipher.toCharArray();
        for (char c :cipherToChar ) {
            ++count;
            if (count%code==0){
                answer+= Character.toString(c);
            }
        }


        return answer;
    }
}