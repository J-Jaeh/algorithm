class Solution {
     public StringBuffer solution(String rsp) {
        StringBuffer answer = new StringBuffer();
        char[] chars = rsp.toCharArray();

        for (char aChar : chars) {
            if ((int)aChar==50){
                answer.append((char)48);
            }else if ((int)aChar==48){
                answer.append((char)53);
            }else{
                answer.append((char)50);
            }
        }
        
        return answer;
    }
}