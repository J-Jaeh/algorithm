import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true){
            String[] ab = br.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            if (a+b == 0) break;
            
            if(a>=b && a%b == 0){
                System.out.println("multiple");
            } else if (a<b && b%a ==0) {
                System.out.println("factor");
            }else{
                System.out.println("neither");
            }
        }
    }
}
