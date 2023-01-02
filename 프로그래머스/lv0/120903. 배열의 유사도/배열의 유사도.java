import java.util.HashSet;
import java.util.List;


class Solution {
    public int solution(String[] s1, String[] s2) {
        HashSet<String> setS1 = new HashSet<>(List.of(s1));
        HashSet<String> setS2 = new HashSet<>(List.of(s2));

        setS1.retainAll(setS2);
        
        return setS1.size();
    
    }
}