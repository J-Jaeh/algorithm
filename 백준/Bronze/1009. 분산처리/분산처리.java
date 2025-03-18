import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    //추천방식 주기성을 이용해보는건 어떠니 ?!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc =Integer.parseInt(br.readLine());
        for(int i=0;i<tc;i++){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            //a의 마지막 자리만 고려하면됨
            a%=10;
            //마지막자리가 10인경우는 뭘 곱해도 10
            if(a==0) {
                System.out.println(10);
                continue;
            }
            //b를 4로 나눈 나머지를 구해야함
            //자연수의 거듭제곱에서 마지막 자리는 일정한 주기를 가지고 보통 이 주기는 최대 4.
            //따라서 2^1의 마지막자리나 2^5의 마지막자리는 2로 동일함
            //주기가 2여도 4의 약수이기 때문에 4로 나머지를 구해도 상관없음.
            int exp = b%4;
            if(exp == 0) exp=4;

            long answer = (long) Math.pow(a,exp);

            if(answer%10==0){
                System.out.println(10);
            }else{
                System.out.println(answer%10);
            }
        }
    }
}
