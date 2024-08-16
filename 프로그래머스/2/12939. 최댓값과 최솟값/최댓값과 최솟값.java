import java.util.*;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        while(st.hasMoreTokens()){
            Integer n = Integer.parseInt(st.nextToken());
            
            if (n>max ) max = n;
            
            if (n<min ) min = n;
            
        }
        
        return min + " " + max ;
    }
}