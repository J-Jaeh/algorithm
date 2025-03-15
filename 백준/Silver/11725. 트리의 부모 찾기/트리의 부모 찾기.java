import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class Main {
    static int N ; // 노드 갯수

    static ArrayList<Integer>[] tree;
    static int[] parent;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        //인접리스트 초기화
        tree = new ArrayList[N+1];
        IntStream.rangeClosed(1,N).forEach(i->tree[i]=new ArrayList<>());
        parent = new int[N+1]; // 1은 룻트 고정
        visited = new boolean[N+1];

        for(int i=1;i<N;i++){
            String[] ab = br.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            tree[a].add(b);
            tree[b].add(a);
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(1);

        while (!q.isEmpty()){
            Integer cNode = q.poll();
            visited[cNode]=true;
            for(Integer next : tree[cNode]){
                if(!visited[next]){
                    parent[next]=cNode;
                    q.add(next);
                }
            }
        }
        Arrays.stream(parent)
                        .filter(i->i!=0)
                        .forEach(System.out::println);
//        System.out.println(Arrays.toString(parent));
    }
}
