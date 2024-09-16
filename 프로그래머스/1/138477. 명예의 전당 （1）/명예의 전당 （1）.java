import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int index=0;
        for(int s:score){
            int size = q.size();
            
            if(size<k){
                q.add(s);
                answer[index++]=q.peek();
            }else{
                if(s>q.peek()){
                    q.add(s);
                    q.poll();
                    answer[index++]=q.peek();
                }else {
                    answer[index++]=q.peek();
                }
            }
        }
        return answer;
    }
}