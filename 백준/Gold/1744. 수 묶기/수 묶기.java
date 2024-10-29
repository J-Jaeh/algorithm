import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> plusPQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusPQ = new PriorityQueue<>();

        int oneCount = 0;
        int zeroCount = 0;
        int ans=0;

        for(int i =0; i<N;i++){
            int input = sc.nextInt();
            if (input<0)  minusPQ.add(input);

            if (input>1) plusPQ.add(input);

            if( input==0) zeroCount++;

            if( input==1) oneCount++;
        }

        int temp = oneCount;

        while (plusPQ.size()>1){
            // 3 개라면
            // 1 2 뽑고 마지막 한개 있으면 그냥 더해줌
            int pollF = plusPQ.poll();
            int pollS = plusPQ.poll();
            temp+=pollF*pollS;
        }
        if(!plusPQ.isEmpty()) ans+=plusPQ.poll();

        ans+=temp;
        temp=0;
        while (minusPQ.size()>1){
            int pollF = minusPQ.poll();
            int pollS = minusPQ.poll();
            temp+=pollF*pollS;
        }
        ans+=temp;

        if(zeroCount==0 && !minusPQ.isEmpty()) ans+=minusPQ.poll();

        System.out.println(ans);
    }
}
