import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    static int[] uf;
    static int V;//노드의 갯수
    static int E;//엣지의갯수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ve = br.readLine().split(" ");
        V = Integer.parseInt(ve[0]);
        E = Integer.parseInt(ve[1]);

        uf=new int[V+1];
        IntStream.rangeClosed(1,V).forEach(i->uf[i]=i);

        List<Edge> edges = new ArrayList<>();
        for(int i =0;i<E;i++){
            String[] abc = br.readLine().split(" ");
            int a = Integer.parseInt(abc[0]);
            int b = Integer.parseInt(abc[1]);
            int c = Integer.parseInt(abc[2]);
            edges.add(new Edge(a,b,c));
        }
        Collections.sort(edges,(a,b)-> a.cost- b.cost);

        long answer =0;
        int count=0;

        for (Edge edge : edges) {
            if(union(edge.from, edge.to)){
                answer+=edge.cost;
                count++;

                if(count == V-1) break;
            }
        }
        System.out.println(answer);

    }

    private static class Edge{
        int from;
        int to;
        int cost;

        public Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }

    private static int find(int x){
        if(uf[x] !=x) uf[x] = find(uf[x]);
        return uf[x];
    }

    // 두집합을 합치는것 .!
    private static boolean union(int a, int b){
        int rA=find(a);
        int rB=find(b);
        if(rA==rB) return false;

        uf[rB] = rA;
        return true;
    }
}
