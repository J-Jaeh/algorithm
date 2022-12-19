class Solution {
   public StringBuffer solution(String phone_number) {
        int phone_number_length = phone_number.length();
       
        StringBuffer answer = new StringBuffer();
       
        String changeToStar = phone_number.substring(phone_number_length-4);
       
        for(int i=0;i<phone_number_length-4;i++){
            answer.append("*");
            
        }
      
        return answer.append(changeToStar);
}
    
}