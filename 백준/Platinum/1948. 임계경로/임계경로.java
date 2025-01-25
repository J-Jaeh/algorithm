import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static class Node{
        int w;
        int to;

        Node(int w, int to) {
            this.w = w;
            this.to = to;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 도시수
        int m = Integer.parseInt(br.readLine()); // 도로의 갯수

        //사전 셋팅 . 1. 인접그래프 / 역그래프 탐색용 / 거리갱신용 / 진입차수용
        ArrayList<Node>[] graph = new ArrayList[n+1];
        ArrayList<Node>[] reversGraph = new ArrayList[n+1];
        int[] dist = new int[n+1];
        int[] degree = new int[n+1];
        boolean[] check = new  boolean[n+1];

        for(int i = 1;i<n+1;i++){
            graph[i]=new ArrayList<>();
            reversGraph[i]=new ArrayList<>();
        }

        for(int i = 0 ; i<m;i++){
            String[] input = br.readLine().split(" ");
            int from =  Integer.parseInt(input[0]);
            int to =  Integer.parseInt(input[1]);
            int w =  Integer.parseInt(input[2]);

            graph[from].add(new Node(w,to));//정방향 맞나 ?
            reversGraph[to].add(new Node(w,from));
            degree[to]++;
        }
        int start,end;
        String[] se = br.readLine().split(" ");
        start = Integer.parseInt(se[0]);
        end = Integer.parseInt(se[1]);

        Queue<Integer> q = new LinkedList<>();

        q.add(start);

        while (!q.isEmpty()){
            Integer nodeIndex = q.poll();
            ArrayList<Node> nodes = graph[nodeIndex];
            for (Node node : nodes) {
                degree[node.to]--;
                dist[node.to]=Math.max(dist[node.to],dist[nodeIndex]+node.w);
                if(degree[node.to]==0){
                    q.add(node.to);
                }
            }
        }
//        for (int i : dist) {
//            System.out.println("dist = " + i);
//        }

        q.add(end);
        int count=0;
        while (!q.isEmpty()){
            Integer nodeIndex = q.poll();
            ArrayList<Node> nodes=reversGraph[nodeIndex];
            for (Node node : nodes) {
                if (dist[nodeIndex] == node.w+dist[node.to]){
                    count++;
                    if(!check[node.to]){
                        q.add(node.to);
                        check[node.to]=true;
                    }
//                    System.out.println(nodeIndex  + " -> "+  node.to);
                }
            }

        }

        System.out.println(dist[end]);
        System.out.println(count);

    }

}
