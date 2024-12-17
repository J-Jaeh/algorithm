import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int[] check;
    static boolean isBi;
    static ArrayList<ArrayList<Integer>> graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            solution(br);
        }
    }

    private static void solution(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

         graph = new ArrayList<>();

        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int F = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            // 단방향이라는 언급이 없으니 양방향으로 연결시킨다
            graph.get(F).add(S);
            graph.get(S).add(F);
        }

        // 1 = 파랑 / -1 = 빨강
        // 탐색먼저 상각해보자
        check = new int[N + 1];
        isBi = true;
        for (int i = 1; i < N + 1; i++) {
            if (check[i] == 0) {
                dfs(i,1);
            }
        }
        if(isBi){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }


    private static void dfs(int node,int c) {
        check[node]=c;
        // 연결된애들방문 대신 재귀로
        for(int nextNode : graph.get(node)){
            if(check[nextNode]==0) {
                dfs(nextNode,-c);
            }else if (check[nextNode]==check[node]){
                isBi=false;
            }
        }

    }
}
