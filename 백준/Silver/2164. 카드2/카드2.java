import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] argus) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        Main main = new Main();

        System.out.println(main.solution(input));

    }

    private int solution(int input){
        Queue<Integer> queue = new ArrayDeque<>();
        //큐를 다채움!
        for(int i =1;i<input+1;i++){
            queue.offer(i);
        }
        //이제 하나 버리고 하나 꺼내서 뒤로가게 하고 하면 되겠네
        //언제까지 큐의 사이즈가 0이 될때까지? 그리고 1이되면 answer에 집어넣고..?
        int answer = 0;
        if (queue.size()==1){
            return 1;
        }

        while (queue.size()!=0){
            queue.poll();
            queue.offer(queue.poll());

            if (queue.size()==1){
                answer= queue.poll();
            }
        }
        return answer;
    }
}
