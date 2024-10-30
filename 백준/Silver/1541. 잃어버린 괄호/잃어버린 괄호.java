import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // +  - 섞여있음.
        String[] minus = input.split("-");
        // + 가 들어있을 수도 있음
        int answer =0;

        for (int i = 0; i < minus.length; i++) {
            int temp = convert(minus[i]);
            if(i==0) answer+=temp;
            else answer-=temp;
        }
        System.out.println(answer);
    }
    private static int convert(String input){
        String[] plus = input.split("\\+");
        int temp=0;

        for(String p : plus){
            temp+=Integer.parseInt(p);
        }
        return temp;
    }
}
