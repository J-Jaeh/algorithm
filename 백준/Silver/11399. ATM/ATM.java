import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] saveSum = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 1; i < N; i++) {
            int insert_point =i;
            int insert_value = A[i];
            for (int j = i - 1; j >= 0; j--) {
                if (A[j] < A[i]) {
                    insert_point = j + 1;
                    break;
                }
                if (j == 0) {
                    insert_point = 0;
                }
            }
            for (int j = i; j > insert_point; j--) {
                A[j] = A[j - 1];

            }
            A[insert_point] = insert_value;
        }
        saveSum[0]=A[0];
        for (int i = 1; i < N; i++) {
            saveSum[i] = A[i] + saveSum[i - 1];
        }
        int sum =0;
        for (int i = 0; i < N; i++) {
            sum += saveSum[i];
        }
        System.out.println(sum);
    }
}
