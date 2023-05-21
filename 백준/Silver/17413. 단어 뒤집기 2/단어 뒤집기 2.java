import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] argus) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //판단해야할것 일단 .. ? / 공백과 <를 ㅅ행각하자
        String input = br.readLine();
        char[] chars = input.toCharArray();
        StringBuffer sb = new StringBuffer();
        Stack<Character> save = new Stack<>();
        boolean check =true;
        for (char a : chars) {
            if(a!='<' && check){
                if(a !=' '){
                    save.push(a); //이렇게 막 쌓아 ~~ 그러다가 빈칸을 만나면
                }else{
                    while (save.size()>0) {
                        sb.append(save.pop());
                    }
                    sb.append(" ");
                }
            }else {
                if(save.size()==0) {
                    check = false;
                    if (a == '>') {
                        check = true;
                        sb.append(a);
                    } else {
                        sb.append(a);
                    }
                }else{
                    while (save.size()>0){
                        sb.append(save.pop());
                    }
                    sb.append('<');
                    check =false;
                }
            }
        }
        if(save.size()!=0){
            while (save.size()>0){
                sb.append(save.pop());
            }
        }
        System.out.println(sb);
    }
}
