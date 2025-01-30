import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int s = sc.nextInt();
        if (s == f || s==0) {
            System.out.println(1);
        } else {
//            System.out.println(factorial(f) / (factorial(s) * factorial(f - s)));
            System.out.println(factorial(f,s));
        }

    }

    private static long factorial(int n,int k) {
//        if (n <= 1) return n;
//        return n * factorial(n - 1);
        if(k>n-k) k = n-k;
        long result =1;
        for(int i =0;i<k;i++){
            result*=(n-i);
            result/=(1+i);
        }
        return result;
    }
}
