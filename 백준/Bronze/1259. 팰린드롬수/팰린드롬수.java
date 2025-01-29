import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
             String input =br.readLine();
             if(input.equals("0")) break;
            System.out.println(isPell(input));
        }
    }

    private static String isPell(String input){
        char[] charArray = input.toCharArray();
        int length = charArray.length;
        int lp=0,rp=length-1;
        while (lp<rp){
            if(charArray[lp]!=charArray[rp]) return "no";
            lp++;
            rp--;
        }
        return "yes";

    }

}
