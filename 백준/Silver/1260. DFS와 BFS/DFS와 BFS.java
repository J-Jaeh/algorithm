import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main  {
    static boolean[] visit;
    static ArrayList<ArrayList<Integer>> A =new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        for(int i =0;i<N+1;i++) A.add(new ArrayList<>());

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A.get(S).add(E);
            A.get(E).add(S);
        }

        visit=new boolean[N+1];
        // bfs먼저
        ArrayList<Integer> bfs= new ArrayList<>();
        BFS(bfs,V);
        bfs.forEach(i -> System.out.print(i+" "));

        System.out.println();

        visit=new boolean[N+1];
        ArrayList<Integer> dfs= new ArrayList<>();
        DFS(dfs,V);
        dfs.forEach(i-> System.out.print(i+" "));


    }

    static void DFS(ArrayList<Integer> dfs, int v) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visit[v]=true;
        while (!q.isEmpty()){
            Integer poll = q.poll();
            dfs.add(poll);

            ArrayList<Integer> integers = A.get(poll);
            integers.sort(Comparator.naturalOrder());
            for(Integer i : integers ){
                if(!visit[i]){
                    visit[i]=true;
                    q.add(i);
                }
            }

        }
    }

    static void BFS(ArrayList<Integer> bfs,int i){
        bfs.add(i);
        visit[i]=true;
        ArrayList<Integer> integers = A.get(i);
        integers.sort(Comparator.naturalOrder());
        for(Integer in : integers ){
            if(!visit[in]){
                BFS(bfs,in);
            }
        }
    }
}
