
import java.util.HashSet;
import java.util.Set;

class Solution {
 public StringBuffer solution(String my_string) {
         StringBuffer answer = new StringBuffer();
        
        char[] new_my_string = my_string.toCharArray();
        
        Set<Character> saveChar = new HashSet<>();
        
        saveChar.add((char)(-1));
        
        for (char c : new_my_string) {  
            if (!saveChar.contains(c)){
                saveChar.add(c);
                answer.append(c);
            }
        }
        return answer;
    }

}