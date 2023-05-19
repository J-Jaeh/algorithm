import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void  main(String[] argus) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int number = Integer.parseInt(br.readLine());
       int saveN = number;
       int count = 0;
       //이렇게 하면 자릿수를 더한거
       Main main = new Main();

       while (true){
           int[] sums = main.sum(number);
           int newN =sums[0]*10+sums[2];
           count++;
           if(newN==saveN){
               break;
           }else {
              number = newN;
           }
       }
        System.out.println(count);

    }
    private int[] sum(int input){
        int[] sum = new int[3];
        int count=0;
        while (count<2){
            // [일의자리. 십의자리]
            sum[count]=input%10;
            input/=10;
            count++;
        }
        //이러면 더한거의 1의자리 ?
        sum[2] = (sum[0]+sum[1])%10;
        return sum;
    }
}
