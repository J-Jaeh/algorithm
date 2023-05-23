import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] argus) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] chae = new int[b+1];

        Queue<Integer> loop = new LinkedList<>();
       
        for(int i =2;i<b+1;i++){
            if(chae[i]==0){
                for(int j=i;j<b+1;j+=i){
                    chae[j]=1;
                }
                loop.offer(i);
            }
        }
        while (a>loop.peek()){
            loop.poll();
        }

        while (!loop.isEmpty()){
            System.out.println(loop.poll());
        }

    }

}
