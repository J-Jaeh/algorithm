import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // N = 노드수 ,. M = 도로수  K = 거리 정보 , X = 출발 도시정보
        // X에서 출발해서 방문기록을 채우면됨
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        // 노드를 먼저 세팅해주고가야함!

        for(int n=0;n<=N;n++){
            graph.add(new ArrayList<>());
        }

        for(int m= 0; m<M;m++){
            st = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            graph.get(f).add(s);
        }

        int[] dist = new int[N+1];
        Arrays.fill(dist,-1);

        // 시작점
        dist[X]=0;

       Queue<Integer> q = new LinkedList<>();
        q.add(X);
        while (!q.isEmpty()){
            Integer node = q.poll();
            ArrayList<Integer> nodes = graph.get(node);
            for (Integer n : nodes) {
                if(dist[n]==-1) {
                    dist[n] = dist[node]+1;
                    q.add(n);
                }
            }
        }

//        System.out.println(Arrays.toString(dist));
        boolean flag=false;

        int index=0;
        for (int i : dist) {
            if(i == K){
                flag=true;
                System.out.println(index);
            }
            index++;
        }
        if(!flag) System.out.println(-1);
    }
}
