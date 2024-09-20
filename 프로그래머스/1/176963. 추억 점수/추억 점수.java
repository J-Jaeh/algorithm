import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String,Integer> sc = new HashMap<>();
        int index=0;
        for (String n : name) {
            sc.put(n,yearning[index++]);
        }
        
        index=0;
        
        for (String[] strings : photo) {
            int s=0;
            for (String n : strings) {
                s+=sc.getOrDefault(n,0);
            }
            answer[index++]=s;
        }
        
        return answer;
    }
}