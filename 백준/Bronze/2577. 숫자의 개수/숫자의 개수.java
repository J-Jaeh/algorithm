import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] argus) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int x = a*b*c;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<10;i++){
            map.put(i,0);
        }
        while (x>0){
            //뒷자리 하나 가져오기
            int one = x%10;
            map.put(one, map.get(one)+1);
            //뒷자리 삭제
            x/=10;
        }

        for(int i =0;i<10;i++){
            System.out.println(map.get(i));
        }
    }
}
