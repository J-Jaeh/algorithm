class Solution {
   public StringBuffer solution(String my_string, int n) {
        
        
        StringBuffer answer = new StringBuffer();
        
        
        char[] newStirng =  my_string.toCharArray();
        
        int count = 0;

        for (char c : newStirng) {
            while (count<n){
                answer.append(c);
                count++;
            }
            count=0;
        }
        
        return answer;
    }
}