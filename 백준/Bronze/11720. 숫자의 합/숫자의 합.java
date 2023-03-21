import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        char[] chars = b.toCharArray();
        long answer = 0;
        for (char aChar : chars) {

            String sv = String.valueOf(aChar);
            int iv = Integer.parseInt(sv);
            answer+=iv;
        }
        System.out.println(answer);
    }
}
