import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
     public int solution(int[] priorities, int location) {

        Deque<Priorities> q = new ArrayDeque<>();
        
        for (int i = 0; i < priorities.length ; i++) {
            q.add(new Priorities(i,priorities[i]));
        }
        int count=0;
        boolean flag;
        while (!q.isEmpty()){
            flag=false;
            Priorities pop = q.pollFirst();
            int temp_max=pop.priorities;
            for (Priorities priorities1 : q) {
                if (temp_max<priorities1.priorities){
                   q.add(pop); 
                   flag=true;
                   break;
                }
            }
            if(!flag ){
                count++;
                if(pop.index==location)return count;
            }
        }
        return -1;

    }

    private class Priorities{
        int index;
        int priorities;

        public Priorities(int index, int priorities) {
            this.index = index;
            this.priorities = priorities;
        }
    }

}
