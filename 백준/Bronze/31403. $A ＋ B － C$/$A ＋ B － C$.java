import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        Integer N = Integer.parseInt(A+B);
        int C = sc.nextInt();
        System.out.println(Integer.parseInt(A)+Integer.parseInt(B)-C);
        System.out.println(Integer.parseInt(A+B)-C);
    }
}
