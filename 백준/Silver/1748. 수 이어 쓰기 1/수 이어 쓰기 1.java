import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void  main(String[] argus) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int firstV = Integer.parseInt(br.readLine());

        int answer =0;

        for (int i = 1; i<firstV+1;i++){
            //자릿수를 구하는
            int site=0;
            int saveN = i;
            while (saveN>0){
                site++;
                saveN/=10;
            }

            answer+=site;

        }
        System.out.println(answer);
    }
}
