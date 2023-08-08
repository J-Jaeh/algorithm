import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
    //2개의 input을 받음
        //좋은 수 찾기.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] numbers = new long[N];
        for(int i=0;i<N;i++){
            numbers[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(numbers);
        //더해서 값이 있는거 찾는거.
        //3포인터 하면 되는거 아닌가 ?
        //일단 자기 자신은 제외 해야함 즉 ...... t인덱스값을 r이나 l이 가지면 안됨.
        int r=N-1,l=0,t=0,count=0;
        while (t<N){
            while (l<r){
                if(l==t||r==t){  // 타겟이면 안되자나
                    if(l==t){
                        l++;
                    }else{
                        r--;
                    }
                }else{ //타겟이 아닌경우에
                    long target = numbers[t];
                    long sum = numbers[r]+numbers[l];
                    if(target==sum){
                        count++;
                        r--;
                        l++;
                        break;  // 너무 오래걸린다 .
                    }else if(target>sum){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
            r=N-1;
            l=0;
            t++;
        }
        System.out.print(count);
    }
}
