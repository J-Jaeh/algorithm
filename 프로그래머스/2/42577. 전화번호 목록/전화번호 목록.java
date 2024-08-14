import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        Map<String,Boolean> checkMap = new HashMap<>();
        for (String phoneNumber : phone_book) {
            checkMap.put(phoneNumber,checkMap.getOrDefault(phoneNumber,true));
        }

        for (String string : phone_book) {
            StringBuffer bf = new StringBuffer();
            for (Character c : string.toCharArray()) {
                bf.append(c);
                // System.out.println(bf.toString());
                String test = bf.toString();
                if (checkMap.containsKey(test) && !string.equals(test)){
                    return false;
                }
            }
        }
        return true;
    }
}
