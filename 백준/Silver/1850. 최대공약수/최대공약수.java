import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc  = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long c = gcd(a,b);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (c>0){
            bw.write("1");
            c--;
        }
        bw.flush();
    }

    private static long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
