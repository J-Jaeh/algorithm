import java.util.HashMap;
import java.util.Map;
   
class Solution {
        public int solution(String[][] clothes) {
            Map<String,Integer> combi=new HashMap<>();

            for (String[] clothe : clothes) {
                combi.put(clothe[1],combi.getOrDefault(clothe[1],0)+1);
            }
            
            int answer=1;
            
            for (Integer value : combi.values()) {
                answer*=(value+1);
            }
            return answer-1;
        }
    }