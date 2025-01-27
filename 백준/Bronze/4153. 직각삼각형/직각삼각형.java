import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String[] inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            int c = Integer.parseInt(inputs[2]);
            if ( a + b + c == 0) break;
            int[] abc = new int[]{a,b,c};
            Arrays.sort(abc);
            System.out.println(isTri(abc[0],abc[1],abc[2]));

        }
    }

    private static String isTri(int a , int b ,int c){
        if ( c*c==a*a+b*b) return "right";
        else return  "wrong";
    }
}
