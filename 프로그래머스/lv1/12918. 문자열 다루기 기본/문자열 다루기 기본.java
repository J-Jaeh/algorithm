class Solution {
    public boolean solution(String s) {
        
        if(s.length() == 4||s.length() ==6){
          char[] chars =  s.toCharArray();

        for (char aChar : chars) {
           if(aChar>58){
               return false;
           }
        }
        return true;
        }
    return false;
    }
}
