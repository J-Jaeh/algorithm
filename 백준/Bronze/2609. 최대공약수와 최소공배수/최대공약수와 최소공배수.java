import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int v = sc.nextInt();
        sc.close();
        System.out.println(gcd(f,v));
        System.out.println(lcm(f,v));
        //24 18  - > 6  72 gcd lcm

    }

    private static int gcd(int a , int b ){
        while (b !=0){
            int temp=a;
            a=b;
            b=temp%b;
        }
        return a;
    }

    private static int lcm(int a , int b){
        return a*(b/gcd(a,b));
    }

}
