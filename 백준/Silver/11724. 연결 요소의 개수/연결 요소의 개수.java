

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<ArrayList<Integer>> A = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visited = new boolean[n+1];
        visited[0]=true;
        // 리스트 초기화
        for (int i = 0; i <= n; i++) {
            A.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            st =new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            //양방향 흠 ..!
            A.get(s).add(e);
            A.get(e).add(s);
        }
        int countDFS=0;
         for (int i =1;i<n+1;i++){
             if(!visited[i]){
                 countDFS++;
                 DFS(i);
             }
         }
        System.out.println(countDFS);
    }

    private static void DFS(int i){
        if(visited[i]) return;

        visited[i]=true;
        for (Integer integer : A.get(i)) {
            if(!visited[integer]){
                DFS(integer);
            }
        }

    }
}
