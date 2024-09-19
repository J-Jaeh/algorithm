import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> countMap = new HashMap<>();
        for (int i : tangerine) {
            if (countMap.containsKey(i)){
                countMap.put(i,countMap.get(i)+1);
            }else{
                countMap.put(i,1);
            }
        }
        //
        PriorityQueue<Guul> pq=new PriorityQueue<>((g1,g2)-> g2.c-g1.c);
        for (Integer key : countMap.keySet()) {
            pq.add(new Guul(key,countMap.get(key)));
        }
        // k 값으로 뽑으면됨
        while (k>0){
            answer++;
            k-=pq.poll().c;
        }
        
        return answer;
    }

    class Guul{
        int w;
        int c;
        public Guul(int w, int c) {
            this.w = w;
            this.c = c;
        }
    }
}
