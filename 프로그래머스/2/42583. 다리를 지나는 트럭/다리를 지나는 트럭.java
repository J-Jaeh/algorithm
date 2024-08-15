import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
  public int solution(int bridge_length, int weight, int[] truck_weights) {
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < bridge_length; i++) {
            q.add(0);
        }
        int b_t_w =0;
        int index=0;
        int time=0;
        while (!q.isEmpty()){
            time++;
            b_t_w-=q.pollFirst();

            if (index<truck_weights.length){
                if(b_t_w+truck_weights[index]<=weight){
                    b_t_w+=truck_weights[index];
                    q.add(truck_weights[index++]);
                }else {
                    q.add(0);
                    }
            }
        }
        
        return time;
    }
}
