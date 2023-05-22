import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] argus) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int firstV = Integer.parseInt(br.readLine());

        int[] a = new int[firstV];
        int[] b = new int[firstV];
        StringTokenizer sta = new StringTokenizer(br.readLine());
        for (int i = 0; i < firstV; i++) {
            a[i] = Integer.parseInt(sta.nextToken());
        }

        StringTokenizer stb = new StringTokenizer(br.readLine());
        for (int i = 0; i < firstV; i++) {
            b[i] = Integer.parseInt(stb.nextToken());
        }
        Arrays.sort(a);
        Arrays.sort(b);

        long sum = 0;

        for (int i = 0; i < firstV; i++) {
            sum += (long) a[i] * b[firstV - 1 - i];
        }
        System.out.println(sum);
    }
}
