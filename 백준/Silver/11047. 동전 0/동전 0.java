import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0 ; i <N;i++){
            arr[i] = sc.nextInt();
        }
        int coin=0;
        N--;
        while (K>0){
            int temp =K/arr[N];
            coin+=temp;
            K-=temp*arr[N--];
        }
        System.out.println(coin);
    }
}
