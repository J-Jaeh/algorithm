import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer> A = new ArrayList<>();
        int start =0;
        int end=0;
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()){
            int temp=Integer.parseInt(st.nextToken());
            A.add(temp);
            if(start<temp) start=temp;
            end+=temp;
        }
        while (start<=end){
            int m= (start+end)/2;
            int sum=0;
            int count=0;
            for (Integer i : A) {
                if(sum+i>m){
                    count++;
                    sum=0;
                }
                sum+=i;
            }
            if(sum !=0) count++;
            if(count>M) start=m+1;
            else end = m-1;
        }
        System.out.println(start);
    }
}
