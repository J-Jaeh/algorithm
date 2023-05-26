
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] argus) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int  a = Integer.parseInt(st.nextToken());
        int  b = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> answer = new LinkedList<>();

        for(int i =1;i<a+1;i++){
            queue.offer(i);
        }


        int count = 1;

        while (queue.size()!=0){
            if(count==b){
                answer.offer(queue.poll());
                count =1;
            }else {
                Integer poll = queue.poll();
                queue.offer(poll);
                count++;
            }
        }

        System.out.print("<");

        int size = answer.size();

        for(int i =0;i<size;i++) {
            if (i == size- 1) {
                System.out.print(answer.poll());
            } else {
                System.out.print(answer.poll() + ", ");
            }
        }
        System.out.print(">");
    }

}
