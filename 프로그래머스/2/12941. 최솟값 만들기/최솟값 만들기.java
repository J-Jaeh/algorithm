import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        //우선순위 큐로 만들어야할듯 ?
        PriorityQueue<Integer> q_a = new PriorityQueue<>();
        PriorityQueue<Integer> q_b = new PriorityQueue<>();
        for(int i=0;i<A.length;i++){
            q_a.add(A[i]);
            q_b.add(B[i]*(-1));
        }
        while(!q_a.isEmpty()){
            Integer a = q_a.poll();
            Integer b = q_b.poll();
            answer +=a*b*(-1);
        }

        return answer;
    }
}