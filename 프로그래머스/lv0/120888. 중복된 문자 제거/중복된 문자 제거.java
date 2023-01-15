
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;

class Solution {
  public StringBuffer solution(String my_string) {
//          StringBuffer answer = new StringBuffer();
        
//         char[] new_my_string = my_string.toCharArray();
        
//         Set<Character> saveChar = new HashSet<>();
        
//         saveChar.add((char)(-1));
        
//         for (char c : new_my_string) {  
//             if (!saveChar.contains(c)){
//                 saveChar.add(c);
//                 answer.append(c);
//             }
//         }  // 막상 해보니까 set으로 할 필요는 없었다.... set이용할라면 순서지킨 링크드 이용하면될듯...
//         return answer;  
      
        StringBuffer answer = new StringBuffer();

        char[] new_my_string = my_string.toCharArray();

        Set<Character> linkedSet = new LinkedHashSet<>();

        for (char c : new_my_string) {
            linkedSet.add(c);
        }
        for (Character character : linkedSet) {
            answer.append(character);
        }
        return answer;
      
    }
    
    

}