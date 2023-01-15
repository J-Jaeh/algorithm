import java.util.HashMap;
import java.util.Map;

class Solution {
     public StringBuffer solution(String letter) {
        Map<String,String> mosrse = new HashMap<>(){{
            put(".-","a");
            put("-...","b");
            put("-.-.","c");
            put("-..","d");
            put(".","e");
            put("..-.","f");
            put("--.","g");
            put("....","h");
            put("..","i");
            put(".---","j");
            put("-.-","k");
            put(".-..","l");
            put("--","m");
            put("-.","n");
            put("---","o");
            put(".--.","p");
            put("--.-","q");
            put(".-.","r");
            put("...","s");
            put("-","t");
            put("..-","u");
            put("...-","v");
            put(".--","w");
            put("-..-","x");
            put("-.--","y");
            put("--..","z");
        }};
        String[] newLetter = letter.split(" ");
        StringBuffer answer = new StringBuffer();

        for (String s : newLetter) {
            answer.append(mosrse.get(s));
        }
        return answer;
    }
}