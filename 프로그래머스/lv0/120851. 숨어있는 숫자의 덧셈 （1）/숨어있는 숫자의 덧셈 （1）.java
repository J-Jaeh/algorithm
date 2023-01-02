class Solution {
 public int solution(String my_string) {
        char[] chars = my_string.toCharArray();
        int answer = 0;
        for (char aChar : chars) {
            if(aChar<60){
                answer+= (aChar-48);
            }
        }
        return answer;
    }
}