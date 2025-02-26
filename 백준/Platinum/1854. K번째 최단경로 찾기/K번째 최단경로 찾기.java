import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Main {
    static int n;
    static int m;
    static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nmk = br.readLine().split(" ");
        int n = Integer.parseInt(nmk[0]);  // 도시의 숫자
        int m = Integer.parseInt(nmk[1]); // 도시간에 존재하는 도로수
        int k = Integer.parseInt(nmk[2]); // k번째 최단경로

        // 시작은 1로 고정
        ArrayList<ArrayList<Node>> graph = new ArrayList<>();

        for(int i=0; i<n+1;i++){
            graph.add(new ArrayList<>());
        }
        for(int i =0;i<m;i++){
            String[] abc = br.readLine().split(" ");
            int a = Integer.parseInt(abc[0]);
            int b = Integer.parseInt(abc[1]);
            int c = Integer.parseInt(abc[2]);
            graph.get(a).add(new Node(b,c));
        }

        PriorityQueue<Integer>[] dist = new PriorityQueue[n+1];
        for(int i =0;i<n+1;i++){
            dist[i]=new PriorityQueue<>(k,(a,b)->b-a);
        }
        dist[1].add(0);

        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->a.cost- b.cost);
        pq.add(new Node(1,0));

        while (!pq.isEmpty()){
            Node cNode = pq.poll();
            int next = cNode.to;
            int currentCost = cNode.cost;

            for(Node nextNode : graph.get(next)){
                int newCost = currentCost + nextNode.cost;
                int pqSize = dist[nextNode.to].size();
                if( pqSize<k){
                    dist[nextNode.to].add(newCost);
                    pq.add(new Node(nextNode.to,newCost));
                }else{
                    int currentBigCost = dist[nextNode.to].peek();
                    if(currentBigCost>newCost){
                        dist[nextNode.to].poll();
                        dist[nextNode.to].add( newCost);
                        pq.add(new Node(nextNode.to,newCost));
                    }
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (dist[i].size() < k)
                System.out.println(-1);
            else
                System.out.println(dist[i].peek());
        }
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
