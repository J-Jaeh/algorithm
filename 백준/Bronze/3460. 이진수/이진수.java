import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for(int i=0;i<testcase;i++){
            int input = sc.nextInt();
            System.out.println(output(input));
        }
    }
    
    private static StringBuffer output(int n){
        char[] charArray = Integer.toBinaryString(n).toCharArray();

        Stack<Character> s = new Stack<>();
        for (char c : charArray) {
            s.push(c);
        }
        StringBuffer sb = new StringBuffer();
        int index=0;
        while (!s.empty()){
            Character pop = s.pop();
            if(pop =='1'){
                sb.append(index);
                sb.append(" ");
            }
            index++;
        }
        
        return sb;
    }
}
