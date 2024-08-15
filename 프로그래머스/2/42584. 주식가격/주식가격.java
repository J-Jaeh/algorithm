import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int[] solution(int[] prices) {
        int n=prices.length;
        int[] answer = new int[n];
        Deque<Integer> s = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && prices[i]<prices[s.peekLast()]){
                Integer time = s.pollLast();
                answer[time]=i-time;
                // System.out.println("in");
            }
            s.add(i);
        }
        while (!s.isEmpty()){
            Integer i =s.pollLast();
            answer[i]=n-i-1;
        }
        return answer;
    }
}
