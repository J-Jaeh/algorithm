import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;// 도시수
    static int S;// 시작도시
    static int E;// 도착도시
    static int M;// 교통수단의 갯수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //시작 끝 ,, 가격 ?>
        //마지막은 각 도시에 도착했을때 벌 수 있는 값 .
        //돈이 무한 -> 벌어들이는 돈이 양수사이클이됨... ! 양수사이클 찾기 , 찾아도-? 안갈수동.. !
        String[] nsem = br.readLine().split(" ");
        N= Integer.parseInt(nsem[0]);
        S= Integer.parseInt(nsem[1]);
        E= Integer.parseInt(nsem[2]);
        M= Integer.parseInt(nsem[3]);

        List<Edge> edges = new ArrayList<>();


        for(int i =  0 ; i<M;i++){
            String[] abc = br.readLine().split(" ");
            int a = Integer.parseInt(abc[0]);
            int b = Integer.parseInt(abc[1]);
            long c = Integer.parseInt(abc[2]);
            edges.add(new Edge(a,b,c));
        }

        String[] c = br.readLine().split(" ");
        long[] cost = new long[N]; /// 인덱스 주위 해야함
        for(int i = 0 ; i < N;i++){
            cost[i] = Long.parseLong(c[i]);
        }
        long[] dist = new long[N+1];
        Arrays.fill(dist,Long.MIN_VALUE);
//        dist[S] = 0;
        dist[S] = cost[S];  //


        // N-1 만큼
        for(int i =1 ; i <=N-1;i++){
            //엣지 강화.! , cost'
            /// update 여부를 체크해서 조기종료가 가능하다 !
            boolean update = false;
            for (Edge edge : edges) {
                int next = edge.to;
                int current = edge.from;
                long cCost = edge.cost;
               
                if(dist[current]!=Long.MIN_VALUE &&  dist[next]<(dist[current]-cCost+cost[next])){
                    dist[next]=dist[current]-cCost+cost[next];
                    update=true;
              
                }
            }
            if(!update) break;
        }

        // 검증단계에서 값이 달라졌다면 양수사이클이 존재 근데 양수사이클이 존재해도 내가 거길 안간다면 의미가없음 .
        // 내가 구현하지 못한 부분 .. !
        // 하나만 체크하는 것이 아닌 무한 이익이 가능하다고 판단되는 도시 표시 (?)
        // 궁금한게 그러면 여기서 이거는 사이클이 다 투르로 되는건가 ?
        boolean[] cycle = new boolean[N];
        for (Edge edge : edges) {
            int next = edge.to;
            int current = edge.from;
            long cCost = edge.cost;
            if(dist[current]!=Long.MIN_VALUE &&  dist[next]<dist[current]-cCost+cost[next]){
                cycle[next]=true;
            }
        }
        // 무한이익이 나오는 사이클에서 end 지점에 갈 수 있는 지 검출
        boolean[] visted = new boolean[N];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<N;i++){
            if(cycle[i]){
                q.add(i);
                visted[i] =true;
            }
        }
        while (!q.isEmpty()){
            int cur = q.poll(); // cur는 무한 사이클에 포함된 도시 인덱스
            for (Edge edge : edges) {
                if(edge.from == cur && !visted[edge.to]){
                    visted[edge.to] =true;
                    q.add(edge.to);
                }
            }
        }

        if(visted[E]){
            System.out.println("Gee");
        } else if (dist[E] == Long.MIN_VALUE) {
            System.out.println("gg");
        }else{
            System.out.println(dist[E]);
        }

    }

    private static class Edge{
        int from;
        int to;
        long cost;

        public Edge(int from, int to, long cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }
}
