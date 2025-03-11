import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static int N;//세로크기
    static int M; // 가로크기

    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};


    // 섬을 구분하고 연결할수 있는 다리를 모두 찾아서 엣지로 등록후에 최소신장트리 -> 연결되는 최솟값 찾기 .
    // bfs와 최소신장트리의 조합 .
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm= br.readLine().split(" ");

        N=Integer.parseInt(nm[0]);
        M=Integer.parseInt(nm[1]);

        map= new int[N][M];
        visited= new boolean[N][M];
        for(int i =0;i<N;i++){
            String[] s = br.readLine().split(" ");
            for(int j=0;j<M;j++){
                map[i][j] = Integer.parseInt(s[j]);
            }
        }
        /*for (int[] ints : map) {
            System.out.println(Arrays.toString(ints));
        }*/

        int landId =1;

        for(int x=0;x<N;x++){
            for(int y=0;y<M;y++){
               if(map[x][y]==1 && !visited[x][y]) {
                   bfs(x, y, landId++);
               }
            }
        }

        //찾은 섬의 총갯수는
        int landCount = landId-1;
        //n->m번섬의 다리길이의 최솟값을 저장하는 배열 ! ! ! ! ! 섬간 다리 길이를 저장이야 인덱스가 섬이고 .. !
        int[][] bridge = new int[landCount+1][landCount+1];
        for(int i = 0;i<=landCount;i++){
            Arrays.fill(bridge[i],Integer.MAX_VALUE);
        }

        for(int x=0;x<N;x++){
            for(int y=0;y<M;y++){
                //물이 아닌 섬을 만날때
                if(map[x][y]>0){
                    int from = map[x][y]; // 시작한다 !
                    for(int i=0;i<4;i++){
                        int nX=x+dx[i];
                        int nY=y+dy[i];
                        int length=0;
                        //같은 방향으로 전진 계속바다, 섬을 만나거나 맵밖으로 나갈경우까지 .
                        while (isInRange(nX,nY)&&map[nX][nY]==0){
                            length++;
                            nX+=dx[i];
                            nY+=dy[i];
                        }
                        // 만약에 맵밖으로 나간경우라면 섬을 못만난것..이렇게하는것보단. 0보다 크고 길이가 2보다 클때
                        // 중요 다른 섬에 도달해야함 ! 그리고 범위내인경우도 생각.
                        if( isInRange(nX,nY) && map[nX][nY]>0 && length>=2 && from!=map[nX][nY]){
                            int to =map[nX][nY];
                            //다리가 존재한다
                            bridge[from][to] = Math.min(bridge[from][to],length);
                            bridge[to][from] = Math.min(bridge[to][from],length);
                        }
                    }
                }

            }
        }


        List<Edge> edges = new ArrayList<>();
        for(int i =1;i<=landCount;i++){
            for(int j=i+1;j<=landCount;j++){
                if(bridge[i][j]!=Integer.MAX_VALUE){
                    edges.add(new Edge(i,j,bridge[i][j]));
                }
            }
        }

        if(edges.isEmpty()){
            System.out.println(-1);
            return;
        }
        Collections.sort(edges, (a,b)->a.cost-b.cost);

        int[] parent = new int[landCount+1];
        IntStream.rangeClosed(1,landCount).forEach(i->parent[i]=i);

//        System.out.println(Arrays.toString(parent));

        int totalCost= 0;
        int countBridge=0;
        for (Edge edge : edges) {
            int rootA = find(parent, edge.from);
            int rootB = find(parent,edge.to);
            if(rootA!=rootB){
                union(parent,rootA,rootB);
                totalCost+=edge.cost;
                countBridge++;
            }
        }

        if (countBridge != landCount - 1) {
//            System.out.println("in");
//            System.out.println("countBridge = " + countBridge);
//            System.out.println("landCount = " + landCount);
            System.out.println(-1);
        } else {
            System.out.println(totalCost);
        }



    }

    private static void bfs(int x, int y , int number){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        visited[x][y]=true;
        map[x][y]=number;

        while (!q.isEmpty()){
            int[] poll = q.poll();
            int cX=poll[0];
            int cY=poll[1];
            for(int i=0;i<4;i++){
                int nX = cX + dx[i];
                int nY = cY + dy[i];
                if(isInRange(nX,nY) && !visited[nX][nY] && map[nX][nY]==1){
                    visited[nX][nY]=true;
                    map[nX][nY]=number;
                    q.add(new int[]{nX,nY});
                }
            }
        }

    }

    private static boolean isInRange(int x,int y){
        if(x>=0 && x<N && y<M && y>=0){
            return true;
        }
        return false;
    }

    private static int find(int[] p,int x){
        if(p[x]==x) return x;
        return p[x]=find(p,p[x]);
    }

    private static void union(int[] p,int x, int y){
        int a = find(p,x);
        int b = find(p,y);
        if(a<b) p[b]=a;
        else p[a]=b;
    }

    private static class Edge{
        int from;
        int to;
        int cost;

        public Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }
}
