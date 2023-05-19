import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] argus) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int[] arrays = new int[a];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0;i<a;i++){
           String token= st.nextToken();
           arrays[i] = Integer.parseInt(token);
        }
       Arrays.sort(arrays);

       int maxValue = arrays[a-1];
       float sum=0;
       for(int i=0;i<a;i++){
           sum+= (float) arrays[i] /maxValue;
       }
       br.close();
        System.out.println(sum*100/a);
    }
}
