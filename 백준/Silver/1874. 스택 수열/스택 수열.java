import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
/// 문제가 불친절하다 .. 입력값을 오름차순으로 표해야한다고 하는게 아닌
    // 스택에 임의으 오름차순의 수를 넣어서 입력값을 표현가능하냐는 뜻 ㅡㅡ
    public static void main(String[] args) throws Exception{
        //자 일단... 4 3 6 8 7 5 2 1
        //          + + + + - - + + - + + - - - - - 이렇게 된다 그럼 한다 ?
        // [4,3,7,2,1]
        //[8,6,5,1,2,7,3,4]
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];

        for(int i =0;i<N;i++){
            A[i]=Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack = new Stack<>();

        StringBuffer sb = new StringBuffer();
        int num =1; // 이 숫자를 오름차순으로 하라는 뜻이여~
        boolean result = true; // NO의 경우 때문에 있는 값;
        for(int i=0;i<N;i++){
            int nowNumber = A[i];
            if(nowNumber>=num) {// 현재 수열 값 >= 오름차순 num일때, push를 해줘서 빼줘바
                //일단 오름차순이니까
                while (nowNumber>=num){//
                    stack.push(num++);//하나씩 더해서 스택에에 넣어줌 이게 오름차순이다 이말임 ㅡㅡ
                    sb.append("+\n");
                }
                //while에 빠져나왔다는건.. nowNumber랑 num이랑 같아졌다는뜻이져
                //이럴때 빼는거죠
                stack.pop();
                sb.append("-\n");
            }else{ //엘스에 왔다는건.. 입력값인 nowNumber보다 오름차순으로 만든 값이 더 클때이다
                //즉 오름수열은 4인데 입력값은 3인경우
                int n = stack.pop(); // 그럼 이제 꺼내봐 같은거내ㅔ ?
                //근데 꺼낸값이 nowNumber 보다 크면... 불가능하다는것..?
                if(nowNumber<n){
                    System.out.println("NO");
                    result=false;
                    break;
                }else {
                    sb.append("-\n");
                }

            }
        }
        if(result) System.out.println(sb.toString());
    }
}
