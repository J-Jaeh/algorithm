import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int i=0;i<tc;i++){
            String[] ba = br.readLine().split(" ");
            int a = Integer.parseInt(ba[0]);
            int b = Integer.parseInt(ba[1]);
            int count =1;
            int statNum =a;
            while (count<b){
                a=statNum*(a%10);
//                System.out.println(a);
                count++;
            }
            if (a%10 == 0){
                System.out.println(10);
            }else{
                System.out.println(a%10);
            }
        }
    }
}
