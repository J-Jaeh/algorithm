import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 유클리드 호제법 (Mod) 연산을 이용한 최소 공배수구하기
        // 유클리드 호제법은 최대 공약수를 구하는 연산임
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i =0;i<tc;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a*b/gcd(a,b));
        }
    }

    private static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }

}
