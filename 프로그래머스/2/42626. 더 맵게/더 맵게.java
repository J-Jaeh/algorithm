import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int s : scoville){
            q.add(s);
        }
        int count=0;
        while(q.size()>1){
            if (q.peek() >=K){
                return count;
            }
            Integer one =q.poll();
            Integer two =q.poll();
            count++;
            q.add(one+two*2);
        }
        
        if (q.peek()>=K){
            return count;
        }
        return -1;
    }
}