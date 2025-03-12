import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    static int N ;//컴퓨터 대수
    static int[][] lan;// 랜선길이모음/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        lan= new int[N][N];
        int totalLen=0;
        for(int i =0;i<N;i++){
            char[] inputs = br.readLine().toCharArray();
            for(int j =0;j<N;j++){
                char input = inputs[j];
                if(input=='0'){
                    lan[i][j] =0;
                    continue;
                }
                int number;
                if(input>='a'){
                    number= input-'a'+1;
                }else{
                    number=input-'A'+27;
                }
                lan[i][j]=number;
//                System.out.println("number = " + number);
                totalLen+=number;
            }
        }
        //엣지리스트
        List<Edge> edgeList = new ArrayList<>();
        for(int i =0;i<N;i++){
            for(int j=0;j<N;j++){
                if(lan[i][j]==0) continue;
                edgeList.add(new Edge(i,j,lan[i][j]));
            }
        }
        edgeList.sort((a,b)-> a.cost-b.cost);
        int[] p = new int[N+1];
        IntStream.rangeClosed(1,N).forEach(i->p[i]=i);
        int totalCost=0;
        int count=0;
        for (Edge edge : edgeList) {
            int rootA = find(edge.from, p);
            int rootB = find(edge.to, p);
            if(rootA!=rootB){
                union(rootA,rootB,p);
                count++;
                totalCost+=edge.cost;
            }
        }
//        System.out.println("count = " + count);
//        System.out.println("totalLen = " + totalLen);
//        System.out.println("totalCost = " + totalCost);
        if(count!=N-1){
            System.out.println(-1);
        }else{
            System.out.println(totalLen-totalCost);
        }

    }
    private static int find(int x,int[] p){
        if(p[x]==x) return x;
        return p[x]=find(p[x],p);
    }

    private static void union(int x, int y , int[] p){
        int a = find(x,p);
        int b = find(y,p);
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
