import java.util.Scanner;

public class Solution {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
       
        StringBuffer answer = new StringBuffer();
       
        int count = 0;
       
        while(count<n) {
            answer.append("*");
            System.out.println(answer);
            count++;
        }
    }
}