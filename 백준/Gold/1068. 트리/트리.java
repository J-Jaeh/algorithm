import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class Main {
    // 노드를 지우고 남은 트리에서 리프토드의 개수를 구하는 프로그램

    static int N;// 노드갯수
    static int K; // 죽일 노드 번호
    // 제네릭지정 필수로 잘해주자 그래야 for-each 돌릴때 int로 추론가능.
    static ArrayList<Integer>[] tree;
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        K=Integer.parseInt(br.readLine());
        tree = new ArrayList[N];
        IntStream.range(0,N).forEach(i->tree[i]=new ArrayList<>());
        //
        int root=-1;
        // 부모를 알려주기때문에 굳이 양방향 연결을 할 필요가 없음
        for(int i = 0;i<N;i++){
            int p = Integer.parseInt(inputs[i]);
            if(p==-1){
                root=i;
            }else{
//                tree[i].add(p);
                tree[p].add(i);
            }
        }

        // K=0 하면 안됨 , K=root를 해야됨 .. 왜냐면 0번인덱스가 부모가 아닐수도 있음 ..!
        if (K == root){
            System.out.println(0);
            return;
        }

        // 삭제노드를 만나면 종료 x 건너뛰어야함 그래야 다른 구역의 리프노드를 카운트할 수 있음 ..

        Queue<Integer> q = new LinkedList<>();
        q.add(root);
        int leaf = 0;
        while (!q.isEmpty()){
            Integer current = q.poll();
            boolean isContainChild = false;
            for (int next: tree[current]) {
                if(next == K) continue;
                isContainChild=true;
                q.add(next);
            }
            if(!isContainChild) leaf++;

        }
        System.out.println(leaf);
    }
}
