import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    static int[] dx={1,-1,0 ,0};
    static int[] dy={0,0,1 ,-1};
    static boolean[][] visit;
    static int[][] A;
    static int N,M;
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N= Integer.parseInt(st.nextToken());
        M= Integer.parseInt(st.nextToken());
        A= new int[N][M];
        visit=new boolean[N][M];
        for(int i =0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j=0 ;j<M;j++){
                A[i][j] = Integer.parseInt(line.substring(j,j+1));
            }
        }
        BFS(0,0);
        System.out.println(answer);
    }

    private static void BFS(int i, int i1) {
        Queue<Node> q = new LinkedList<>();
        visit[i][i1]=true;
        q.add(new Node(i,i1,1));
        while (!q.isEmpty()){
            Node dot = q.poll();
            if (dot.x ==M-1 && dot.y==N-1){
                answer=dot.count;
                return;
            }
            for(int j =0; j<4;j++){
                int tempX= dot.x +dx[j];
                int tempY= dot.y +dy[j];
                if(tempX>=0 &&tempY>=0 && tempX<M &&tempY<N && A[tempY][tempX]!=0 && !visit[tempY][tempX]){
                    visit[tempY][tempX]=true;
                    q.add(new Node(tempX,tempY, dot.count+1));
                }
            }
        }



    }
    private static class Node{
        int x;
        int y;
        int count;

        public Node(int x, int y,int count) {
            this.x = x;
            this.y = y;
            this.count=count;
        }
    }
}
