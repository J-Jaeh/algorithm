import java.util.ArrayList;
import java.util.Comparator;

class Solution {
  public StringBuffer solution(String my_string) {
        StringBuffer answer = new StringBuffer();
        
        char[] new_my_string = my_string.toCharArray();

        ArrayList<Character> lowerList = new ArrayList<>();

        for (char c : new_my_string) {
            if(c<97){
                lowerList.add((char)(c+32));
            }else{
                lowerList.add(c);
            }
        }
        //소문자 변경완료
        
        lowerList.sort(Comparator.naturalOrder());

        for (Character character : lowerList) {
            answer.append(character);
        }
        return answer;
    }
}