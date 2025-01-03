import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] cities;

    static void union(int from, int to){
        int a = find(from);
        int b = find(to);
        if ( a != b){
            cities[b]=a;
        }
    }

    static int find(int a){
        int to = cities[a];
        if( a == to) return  a;
        return cities[a]=find(cities[a]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int M = Integer.parseInt(br.readLine());//여행 계획에 속한 도시의 수 .

        cities = new int[N+1];
        for(int i =0;i<N+1;i++){
            cities[i]=i;
        }

        int[][] map = new int[N][N];
        for(int i =0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        // 연결하고 ~
        for(int i =1;i<N+1;i++) {
            for(int j=i;j<N+1;j++){
                if(map[i-1][j-1]!=0){
                    union(i,j);
                }
            }
        }
//        for (int city : cities) {
//            System.out.print(city);
//        }

        int check= -1;
        boolean isSame = true;


        StringTokenizer st = new StringTokenizer(br.readLine());

        int count =0;
        while (st.hasMoreTokens()){
            int city= Integer.parseInt(st.nextToken());

            if (count==0){
                count++;
                check=find(city);
                continue;
            }

            if(check != find(city)) {
                isSame=false;
                break;
            }
            check=find(city);
        }


        if(isSame){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
