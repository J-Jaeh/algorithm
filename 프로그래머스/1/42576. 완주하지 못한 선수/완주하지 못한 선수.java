import java.util.Arrays;


class Solution {
       public String solution(String[] participant, String[] completion) {
           Arrays.sort(participant);
           Arrays.sort(completion);
           int i = 0;
           for(String c:completion){
               if(!c.equals(participant[i])){
                   return participant[i];
               }
               i++;
           }
           
        return participant[i];
    }
}