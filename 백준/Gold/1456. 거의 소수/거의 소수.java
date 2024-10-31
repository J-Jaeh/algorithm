import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long min = sc.nextLong();
        long max = sc.nextLong();
        long[] A = new long[10000001];
        // 채를 만듦
        A[0] =1 ;
        A[1] =1 ;
        for(int i =2;i<=Math.sqrt(A.length);i++){
             if (A[i]==1) continue;
             int start = i+i;
             for(;start<A.length;start+=i){
                 A[start]=1;
             }
        }

        int count =0;

        for(int i =2;i<A.length;i++){
            if(A[i]==0){ // 소수이면 .! 소수의 곱들이 제곱에 포함되는지
                long temp = i;
                while ((double)i<=(double) max/(double)temp){
                    if((double)i>=(double) min/(double)temp) count++;

                    temp*=i;
//                    System.out.println(temp);
                }
            }
        }
        System.out.println(count);
    }
}
