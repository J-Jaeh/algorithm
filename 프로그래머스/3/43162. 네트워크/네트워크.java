import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int solution(int n, int[][] computers) {
        int net = 0;

        Deque<Integer> q = new ArrayDeque<>();
        boolean[] vi = new boolean[n];
        for (int i = 0; i < n; i++) {
            q.add(i);
            if (!vi[i]) {
                vi[i] = true;
                while (!q.isEmpty()) {
                    int dot = q.pollFirst();
                    for (int j = 0; j < n; j++) {
                        if (computers[dot][j] == 1 && !vi[j]) {
                            vi[j] = true;
                            q.add(j);
                        }
                    }
                }
                net++;
            }
            
        }
        return net;
    }
}
