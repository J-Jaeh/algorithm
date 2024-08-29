import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<ArrayList<Integer>> A= new ArrayList<>();
    static boolean[] vist;
    static boolean isFive=false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        vist = new boolean[N];
        for(int i=0;i<=N;i++){
            A.add(new ArrayList<>());
        }
        for(int i=1;i<M+1;i++){
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A.get(S).add(E);
            A.get(E).add(S);
        }
        //깊이가 5까지 들어갔다면 종료하면 되는거아닌가 ?
        for(int i =0;i<N;i++){
          
            DFS(i,1);
            if(isFive) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);

    }
    static void DFS(int s,int d){
        if(d==5){
            isFive=true;
            return ;
        }
        vist[s]=true;
        for(Integer i : A.get(s)){
            if(!vist[i]) {
                DFS(i, d + 1);
                if(isFive) return;
            }
        }
        vist[s]=false;
    }
}
