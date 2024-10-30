import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] input = new int[n][2];

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            input[i][0] = Integer.parseInt(st.nextToken());
            input[i][1] = Integer.parseInt(st.nextToken());
        }

           Arrays.sort(input,(a,b)-> {
            if(a[1]==b[1]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1],b[1]);
        });

        int count = 0;
        int start=-1;

        for(int[] i : input){
            if(start<=i[0]){
                start=i[1];
                count++;
            }
        }

        System.out.println(count);
    }
}
