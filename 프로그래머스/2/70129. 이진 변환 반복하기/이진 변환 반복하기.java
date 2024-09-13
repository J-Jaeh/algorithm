class Solution {
        public int[] solution(String s) {
            int[] answer = {0,0};
            while (s.length()!=1){
                String replace = s.replace("0", "");
                int len= replace.length();
                answer[0]+=1;
                answer[1]+=s.length()-len;
                s=Integer.toBinaryString(len);
            }
            return answer;
        }
}