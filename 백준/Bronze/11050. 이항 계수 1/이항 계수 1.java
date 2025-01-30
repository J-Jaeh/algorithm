import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int s = sc.nextInt();
        if (s == f || s==0) {
            System.out.println(1);
        } else {
            System.out.println(factorial(f) / (factorial(s) * factorial(f - s)));
        }
        
    }
    
    private static int factorial(int n) {
        if (n <= 1) return n;
        return n * factorial(n - 1);
    }
}
