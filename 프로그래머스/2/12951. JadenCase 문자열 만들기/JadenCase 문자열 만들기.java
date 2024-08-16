import java.util.*;

class Solution {
    public String solution(String s) {
        String[] word = s.toLowerCase().split(" ", -1);
        StringBuilder sb = new StringBuilder();
        
        for (String w : word) {
            if (!w.isEmpty()) {
                char c = w.charAt(0);
                if (Character.isAlphabetic(c)) {
                    sb.append(Character.toUpperCase(c));
                    sb.append(w.substring(1));
                } else {
                    sb.append(w);
                }
            }
            sb.append(" ");
        }
        
        // 마지막에 추가된 공백 제거
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
