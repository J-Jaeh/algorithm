import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    //일반적인 최단거리가아닌 모든 노드에 대해서 최단 거리를 구해야할 때 쓰는 폴리이드 - 퍼셜 알고리즘 V^3의 시간복잡도를 가지고있음
    // 노드의 갯수가 작아야해 !
    // Integer.MAX_VALUE 를 한다면 .. 버스값 계산에서 integer의 범위를 넘어버림 .. 즉 적당히 큰값으로 해야할듯
    // 비용 최댓값 1000000, 도시갯수 100
    static  int INF = 100000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());// 도시수
        int m = Integer.parseInt(br.readLine());// 노선의 갯수

        int[][] dist = new int[n+1][n+1];
        // 자기자신을 제외한 값 무한으로 표시,
        for(int i = 1;i<=n;i++){
            Arrays.fill(dist[i],INF);
//            System.out.println(Arrays.toString(dist[i]));
            dist[i][i]=0;
        }

        for(int i =0;i<m;i++) {
            String[] abc = br.readLine().split(" ");
            int a = Integer.parseInt(abc[0]);
            int b = Integer.parseInt(abc[1]);
            int c = Integer.parseInt(abc[2]);
            // 같은 노선이 여러번 주어질 수도있으므로 더 작은 값을 저장해야함 ..!
//            dist[a][b]=c;
            dist[a][b]= Math.min(dist[a][b],c);
        }

        // 중간 시작 끝,
        for(int k =1;k<n+1;k++){
            for(int i =1;i<n+1;i++){
                for(int j=1;j<n+1;j++){
//                    System.out.println(" k i j = " + k + " " + i +  " " + j);
                    if(dist[i][j]>dist[i][k]+dist[k][j]){
                        dist[i][j]=dist[i][k]+dist[k][j];
                    }
                }
            }
        }

        String result = IntStream.rangeClosed(1, n).
                mapToObj(i -> IntStream.rangeClosed(1, n)
                        .mapToObj(j -> dist[i][j] == INF ? "0" : String.valueOf(dist[i][j]))
                        .collect(Collectors.joining(" "))
                ).collect(Collectors.joining("\n"));

        System.out.println(result);
    }
}
