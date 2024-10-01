import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i : section) {
            q.add(i);
        }
        while (!q.isEmpty()){
            int start = q.poll();
            while (!q.isEmpty() && start+m> q.peek()){
                q.poll();
            }
            answer++;
        }
        return answer;
    }
}