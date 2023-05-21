import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    Stack<Integer> stack = new Stack<>();

    public static void main(String[] argus) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int firstV = Integer.parseInt(br.readLine());

        Main main = new Main();
        long outPut = 0;
        for (int i = 0; i < firstV; i++) {
            int a = Integer.parseInt(br.readLine());
            outPut += main.solution(a);
        }
        System.out.println(outPut);
    }

    private long solution(int input) {
        long sum = 0;
        if (input != 0) {
            stack.push(input);
            sum += input;
        } else {
            Integer pop = stack.pop();
            sum -= pop;
        }
        return sum;
    }
}
