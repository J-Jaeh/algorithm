import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        M=Integer.parseInt(br.readLine());

        // 단방향 그래프
        ArrayList<ArrayList<Node>> graph = new ArrayList<>();
        for(int i =0; i<N+1;i++){
            graph.add(new ArrayList<>());
        }

        // cost
        int[] cost = new int[N+1];
        Arrays.fill(cost,Integer.MAX_VALUE);

        for(int i = 0 ; i<M;i++){
            String[] abc = br.readLine().split(" ");
            graph.get(Integer.parseInt(abc[0])).add(new Node(Integer.parseInt(abc[1]),Integer.parseInt(abc[2])));
        }

        String[] ft = br.readLine().split(" ");

        int form = Integer.parseInt(ft[0]);
        int to = Integer.parseInt(ft[1]);
        cost[form]=0;
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->a.cost- b.cost);
        pq.add(new Node(form,0));

        while (!pq.isEmpty()){
            Node nNode = pq.poll();
            //이미 처리된 경로 패싱
            if(cost[nNode.to] < nNode.cost) continue;

            //경로 업데이트
            for (Node next : graph.get(nNode.to)) {
                int nextCost = next.cost + nNode.cost;
                if(nextCost<cost[next.to]){
                    cost[next.to] =nextCost;
                    pq.add(new Node(next.to,nextCost));
                }
            }
        }
        System.out.println(cost[to]);
    }

    private static class Node{
        int to;
        int cost;

        public Node(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }
}
