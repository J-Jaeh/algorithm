import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static int N; // 도시의 갯수
    static int M; // 버스 노선의 갯수

    public static void main(String[] args) throws IOException {
        //벨만포트 .. 모든 간선을 순회 해야함 ..

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        N = Integer.parseInt(nm[0]);
        M = Integer.parseInt(nm[1]);

        ArrayList<Edge> edges = new ArrayList<>();
        for(int i = 0;i<M;i++){
            String[] abc= br.readLine().split(" ");
            int a = Integer.parseInt(abc[0]);
            int b = Integer.parseInt(abc[1]);
            long c = Long.parseLong(abc[2]);
            edges.add(new Edge(a,b,c));
        }
        long[] dist = new long[N+1];
        Arrays.fill(dist,Long.MAX_VALUE);
        dist[1]=0;

        // 도시의 갯수 -1 번 반복해서 모든 간산에 대해 완화작업... (즉 거리 업데이트)
        // 완화작업 D[s] ! = INF && D[e]>D[s]+w;
        // 하나의 노드에대햇허 모든 ..! 엣지를 탐색 하고 그렇게 n-1개하는거..
        for(int i =1;i<=N-1;i++){
            for (Edge edge : edges) {
                if(dist[edge.from]!=Long.MAX_VALUE && dist[edge.to]>dist[edge.from]+ edge.weight){
                    dist[edge.to]=dist[edge.from]+ edge.weight;
                }
            }
        }

        boolean check = false;
        for (Edge edge : edges) {
            if(dist[edge.from] !=Long.MAX_VALUE && dist[edge.to]>dist[edge.from]+ edge.weight){
                check=true;
                break;
            }
        }

        if(check){
            System.out.println(-1);
        }else{
            StringBuilder sb = new StringBuilder();
            for(int i = 2; i<=N;i++){
                if(dist[i]==Long.MAX_VALUE){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(dist[i]).append("\n");
                }
            }
            System.out.println(sb.toString());
        }
    }

     private static class Edge{
         int from;
         int to;
         long weight;

         public Edge(int from, int to, long weight) {
             this.from = from;
             this.to = to;
             this.weight = weight;
         }
     }
}
