import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] argus) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int firstV = Integer.parseInt(br.readLine());

        //이제 규칙을 생각//삼각형이니까 3개
        //1 -> 1-> 1-> 2(1+1)->2(1+1) -> 3(1+2)->4(2+2)->5(3+2)->7(3+4)->9(4+5)->12(5+7)->16
        Main main = new Main();

        long[] answer = new long[firstV];
       for(int i = 0;i<firstV;i++) {
           int a = Integer.parseInt(br.readLine());
           answer[i]= main.solution(a);
       }
        for (long i : answer) {
            System.out.println(i);
        }

    }

    private long solution(int input){

       if(input<4){
           return 1;
       }
      long[] array = new long[input];

       for(int i=0;i<3;i++){
          array[i]=1;
      } //[1,1,1,0,0,0,0 '''''']
        //String 화해서 보관해야함 .x
        //long으로 하자! 기억해 ~ 
        //안그러면 범위를 초과해버리는듯 ?
        //

      for(int i=3;i<input;i++){
          array[i]=array[i-2]+array[i-3];
      }
      return array[input-1];
    }

}
