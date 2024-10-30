import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int[] chae = new int[N+1];
        chae[0] =1;
        chae[1] =1;
        for(int i =2 ; i<=Math.sqrt(N);i++){
            if(chae[i]==1) continue;
            int start = i+i;
            for(;start<=N;start+=i){
                chae[start]=1;
            }
        }
        for(;M<=N;M++){
            if(chae[M]==0) System.out.println(M);
        }
    }
}
