class Solution {
   public int solution(String s) {
        String[] numberList ={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int count = 0;
        
        for (String s1 : numberList) {
            s= s.replaceAll(s1,count+"");
            count++;
        }
       int answer = Integer.parseInt(s);
        return answer;
    }
}