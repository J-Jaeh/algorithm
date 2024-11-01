import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //에라채 응용 ? min 값 받아서 처리 ?
        long min = sc.nextLong();
        long max = sc.nextLong(); // 최대 + 10000000

        boolean[] check = new boolean[(int)(max-min+1)];

        // 2 배수 먼저 확인 ..
        for(long i =2;i*i<=max;i++){
            long p = i*i;
            long start_index=min/p;
            if(min%p !=0){
                start_index++;
            }
            for(long j =start_index;p*j<=max;j++){
                check[(int)(p*j-min)]=true;
            }
        }
        int count =0;
        for(int i=0;i<=max-min;i++){
            if(!check[i]) count++;
        }
        System.out.println(count);
        //

    }
}
