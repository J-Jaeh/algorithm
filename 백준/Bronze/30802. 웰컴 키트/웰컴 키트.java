import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String[] size = br.readLine().split(" ");
        String[] tp = br.readLine().split(" ");
        
        int t, p;
        t = Integer.parseInt(tp[0]);
        p = Integer.parseInt(tp[1]);

        int tOut = 0, pOutF = N / p, pOutS = N % p;

        for (String s : size) {
            int tSize = Integer.parseInt(s);
            if (tSize % t == 0) {
                tOut += tSize / t;
            } else {
                tOut += tSize / t + 1;
            }
        }
        System.out.println(tOut);
        System.out.println(pOutF + " " + pOutS);
    }
}
