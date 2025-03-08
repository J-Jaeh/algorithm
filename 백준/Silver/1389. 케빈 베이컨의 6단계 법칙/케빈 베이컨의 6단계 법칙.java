import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;//유저수
    static int M;//관계의수
    static int INF = 500001;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");

        N=Integer.parseInt(nm[0]);
        M=Integer.parseInt(nm[1]);

        int[][] graph = new int[N+1][N+1];
        for(int i =0;i<N+1;i++){
            Arrays.fill(graph[i],INF);
            //자기자신 x니까
            graph[i][i] =0;
        }

        for(int i = 0; i<M;i++){
            String[] ab =br.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        //플워
        for(int k=1;k<N+1;k++){
            for(int i =1;i<N+1;i++){
                for(int j = 1;j<N+1;j++){
                    if(graph[i][j]>graph[i][k]+graph[k][j]){
                        graph[i][j]=graph[i][k]+graph[k][j];
                    }
                }
            }
        }

        int min = INF;
        int minIndex=1;
        for(int i=1;i<N+1;i++){
//            System.out.println(Arrays.toString(graph[i]));
            int sum = Arrays.stream(graph[i]).filter( a -> a !=INF).sum();
//            System.out.println(sum);
            if(min>sum){
                min=sum;
                minIndex=i;
            }
        }
        System.out.println(minIndex);
    }
}
