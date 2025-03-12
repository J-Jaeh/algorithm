import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static int N ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N= sc.nextInt();

        int sum = IntStream.rangeClosed(1, N).sum();
        System.out.println(sum);
    }
}
