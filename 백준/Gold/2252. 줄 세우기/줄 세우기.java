import java.util.*;

/*
    위상정렬을 사용해
    인접리스트와, 진입차수 두개를 이용해서 ..
    그래프 문제이니까 그래프를 인접리스트로 표현해야하고
    동시에 각 노드의 진입차수를 기록하면됨 ..
    진입차수가 0이다 즉 나를 향하는 애들이 없다 .. !

 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0;i<=N;i++){
            graph.add(new ArrayList<>());
        }

        int[] index = new int[N+1];
        index[0]=-1;

        for(int i=0;i<M;i++){

            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b); // ? 이게 단방향 맞낭 .. ? 흠 !
            index[b]++; //진입차수.

        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            if (index[i] == 0) {
                q.add(i);
            }
        }
        List<Integer> result = new ArrayList<>();


        while (!q.isEmpty()){
            int node = q.poll();
            result.add(node);
            for(int next : graph.get(node)){
                index[next]--;
                if(index[next]==0){
                    q.add(next);
                }
            }
        }

        for (Integer i : result) {
            System.out.print(i+" ");
        }




    }
}
