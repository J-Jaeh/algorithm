import java.util.ArrayList;
import java.util.Arrays;

class Solution {
public StringBuffer solution(String my_string) {

        StringBuffer answer = new StringBuffer();

        char[] chars = my_string.toCharArray();
        
        String[] compare ={"a","e","i","o","u"};
        
        ArrayList<String> com = new ArrayList<>(Arrays.asList(compare));
        
        for (char aChar : chars) {
            if(!com.contains(aChar+"")){
                answer.append(aChar);
            }
        }

        return answer;
    }
}