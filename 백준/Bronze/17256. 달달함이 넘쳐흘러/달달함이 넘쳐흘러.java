import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    static int[] A = new int[3];
    static int[] C = new int[3];
    static int[] B = new int[3];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        String[] c = br.readLine().split(" ");
        IntStream.rangeClosed(0,2).forEach(i->A[i]=Integer.parseInt(a[i]));
        IntStream.rangeClosed(0,2).forEach(i->C[i]=Integer.parseInt(c[i]));
        B[0] = C[0] - A[2];
        B[1] = C[1] / A[1];
        B[2] = C[2] - A[0];
        String answer = Arrays.stream(B)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(answer);
    }
}
