import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<N;i++) {
            pq.add(sc.nextInt());
        }
        int ans =0;
        while (pq.size()>1){
            int fV=pq.poll();
            int sV=pq.poll();
            ans+=(fV+sV);
            pq.add(fV+sV);
        }

        System.out.println(ans);
    }
}
