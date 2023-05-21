import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
    public static void main(String[] argus) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int firstV = Integer.parseInt(br.readLine());
    Main main = new Main();

    for (int i=0;i<firstV;i++){
    String input = br.readLine();
    System.out.println(main.sol(input));
    }
    }

    private String sol(String input){
        char[] chars = input.toCharArray();

        Stack<Character> stack = new Stack<>();
        for (char a : chars) {
            if(a == '('){
                stack.push(a);// (를 스택에 쌓아 // 아니라면?
            }else{
                //stack.pop();//꺼내 ~?또 if문의 분기가 들어가야할 느낌임
                if(stack.size()!=0){ //즉 스택에 사이즈가 있다면
                    stack.pop();//꺼내면되고
                }else return "NO";   // 없으면 짝이 아니니까 바로 리턴
            }
        }
        // 다돌았는데도 사이즈가 남아있따면
        if(stack.size()!=0){
            return "NO";
        }
        return "YES";
    }
}
