import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i =0; i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] e : edge){
            graph.get(e[0]-1).add(e[1]-1);
            graph.get(e[1]-1).add(e[0]-1);
        }
        Deque<Integer> q = new ArrayDeque<>();
        boolean[] vi = new boolean[n];
        int[] dist = new int[n];
        q.add(0);
        vi[0] = true;

        while(!q.isEmpty()){
            int dot = q.pollFirst();
            for(int d : graph.get(dot)){
                if(!vi[d]){
                    vi[d]=true;
                    q.add(d);
                    dist[d]=dist[dot]+1;
                }
            }
        }
        int max=0;
        for(int d : dist){
            max=Math.max(d,max);
        }
        int answer = 0;

        for(int d : dist){
            if (max == d){
                answer++;
            }
        }

        return answer;
    }
}