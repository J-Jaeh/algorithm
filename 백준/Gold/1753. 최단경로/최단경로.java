import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Node {
        int w;
        int to;

        public Node(int w, int to) {
            this.w = w;
            this.to = to;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ve = br.readLine().split(" ");

        int V = Integer.parseInt(ve[0]);
        int E = Integer.parseInt(ve[1]);

        int start = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Node>> graph = new ArrayList<>();
        for (int i = 0; i < V + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {

            String[] uvw = br.readLine().split(" ");
            int u = Integer.parseInt(uvw[0]);
            int v = Integer.parseInt(uvw[1]);
            int w = Integer.parseInt(uvw[2]);
            graph.get(u).add(new Node(w, v));

        }

        int[] dist = new int[V + 1];
//        Map<Integer, ArrayList<Integer>> check = new HashMap<>();

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = -1;
        dist[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->a.w-b.w);
        pq.add(new Node(0,start));
        while (!pq.isEmpty()) {
            Node cNode = pq.poll();
            int now = cNode.to;
            int currentW= cNode.w;

            if(dist[now]<currentW) continue;

            for(Node next :graph.get(now)){
                if(dist[next.to]>next.w+currentW){
                    dist[next.to]=next.w+currentW;
                    pq.add(new Node(next.w+currentW,next.to));
                }
            }
        }

        for (int i : dist) {
            if (i == -1) continue;
            if (i == Integer.MAX_VALUE) {
                System.out.println("INF");
            } else {
                System.out.println(i);
            }
        }

    }
}

