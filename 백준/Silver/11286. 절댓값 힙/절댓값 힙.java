import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/*
우선순위큐 사용하기
 */
public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pQ = new PriorityQueue<>((a,b)-> {
            int first_ads = Math.abs(a);
            int second_ads = Math.abs(b);
            if (first_ads==second_ads) return a>b ? 1 :-1; //?? 절대값이 같으면 음수 우선 정렬
             else return first_ads-second_ads ; // ? wjf 절대값 기준으로 정렬..?
        });

       for (int i=0;i<N;i++){
           int request = Integer.parseInt(br.readLine());
           if(request==0){
               if (pQ.isEmpty()) {
                   System.out.println("0");
               }else System.out.println(pQ.poll());  //
           }else pQ.add(request);
       }

    }
}
