class Solution {
    public String solution(String s) {
        String answer = "";
        int count = s.length();
        if(count%2==0){
            answer+= s.charAt((count/2)-1);
            answer+= s.charAt(count/2);
        }else {
           answer+=s.charAt((count-1)/2);
        }
        return answer;
    }
}