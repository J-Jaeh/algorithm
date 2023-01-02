class Solution {
 public int solution(String my_string) {
        char[] chars = my_string.toCharArray();
        int answer = 0;
        for (char aChar : chars) {
            if(aChar<60){
                answer+= (aChar-'0'); //숫자 0 =아스키코드로 48
            }   //자동형변환
        }
        return answer;
    }
}