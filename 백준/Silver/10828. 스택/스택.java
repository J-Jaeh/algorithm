import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main{
    List<Integer> stack = new LinkedList<>();

    public static void main(String[] argus) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main main = new Main();
        int firstV = Integer.parseInt(br.readLine());

        for (int i = 0; i < firstV; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String token = st.nextToken();
            if (token.equals("push")) {
                int input = Integer.parseInt(st.nextToken());
                main.solution("push", input);
            } else {
                main.solution(token);
            }
        }

    }

    private void solution(String input) {
        int size = stack.size();
        switch (input) {
            case "pop": {
               //값이 없으면 0 , 값이 있다면 1 이상이지 인덱스번호니 -1
                if (size != 0) {
                    System.out.println(stack.get(size - 1));
                    stack.remove(size - 1);
                } else {
                    System.out.println(-1);
                }
                break;
            }
            case "size": {
                System.out.println(size);
                break;
            }
            case "empty": {
                if ((size == 0)) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
                break;
            }
            case "top": {
                if (size == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.get(size - 1));
                }
                break;
            }
        }
    }

    private void solution(String size, int input) {
        stack.add(input);
    }
}
