import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    static  int N ; // nxn 배열
    static int INF = 10001;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        int[][] graph = new int[N][N];
        for(int i =0;i<N;i++){
            Arrays.fill(graph[i],INF);
//            graph[i][i]=0;
        }

        for(int i=0;i<N;i++){
            String[] inputs=br.readLine().split(" ");
            for(int j=0;j<N;j++){
                if(inputs[j].equals("1")){
                    graph[i][j]=1;
                }
            }
        }
        //플로이드 워셜 이용 ,, but 자기자신으로 돌아올수 있는지 도 알아봐야하는데 ;; 흠 .. !
        for(int k = 0;k<N;k++){
            for(int i =0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(graph[i][j]>graph[i][k]+graph[k][j]){
                        graph[i][j]=1;
                    }
                }
            }
        }

//        for(int i =0;i<N;i++){
//            System.out.println(Arrays.toString(graph[i]));
//        }
        String result = IntStream.range(0, N)
                .mapToObj(i -> IntStream.range(0, N)
                        .mapToObj(j -> (graph[i][j] == INF ||graph[i][j]==0) ? "0" : "1")
                        .collect(Collectors.joining(" "))
                ).collect(Collectors.joining("\n"));

        System.out.println(result);

    }
}
