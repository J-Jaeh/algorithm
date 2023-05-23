
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] argus)  throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int firstV = Integer.parseInt(br.readLine());
        int sol =0;

        Main main = new Main();
        for (int i =0;i<firstV;i++){
            sol += main.solution(br.readLine());
        }

        System.out.println(sol);

    }
    private int solution(String input){
        char[] chars = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        Map<Character,Integer> map = new HashMap<>();

        for (char a : chars) {

            if(stack.size()==0){
                stack.push(a);
            }

            if(stack.peek()!=a){
                stack.push(a);// 연속되지 않으면 들어감 //
            }//아 그리고 이러면 변형된 set처럼 만들어짐

            //그리고 map을 사용해서 이미 키가 존재한다? 그러면 바로 리턴0이고
            //다 돌렸을때  키 존재 안해? 그럼 리턴1
        }

        while (stack.size()!=0){
            Character pop = stack.pop();
            if(!map.containsKey(pop)){
            map.put(pop,0);
            }else return 0;

        }

        return 1;
    }
}
