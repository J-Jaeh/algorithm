import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visit;
    static int[] distance;
    static ArrayList<ArrayList<Edge>> A  = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        for(int i =0;i<N+1;i++){
            A.add(new ArrayList<>());
        }
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            while (true){
                int L = Integer.parseInt(st.nextToken());
                if (L==-1) break;
                int R = Integer.parseInt(st.nextToken());

                A.get(S).add(new Edge(L,R));
            }
        }
        distance = new int[N+1];
        visit= new boolean[N+1];
        BFS(1);
        int MAX = 1;
        for(int i=2;i<=N;i++){
            if(distance[MAX]<distance[i]) MAX=i;
        }

        distance = new int[N+1];
        visit= new boolean[N+1];
        BFS(MAX);
        int answer=Integer.MIN_VALUE;
        for (int i : distance) {
            if (answer<i) answer=i;
        }
        System.out.println(answer);
    }

    private static void BFS(int i) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visit[i]=true;
        while (!q.isEmpty()){
            int node = q.poll();
            for(Edge ed : A.get(node)){
                int e = ed.e;
                int v = ed.value;
                if(!visit[e]){
                    visit[e] =true;
                    q.add(e);
                    distance[e] = distance[node]+v;
                }
            }
        }

    }


    private static class Edge{
        int e;
        int value;

        public Edge(int e, int value) {
            this.e = e;
            this.value = value;
        }
    }
}
