import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] argus) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        Map<String,Integer> checkMap = new HashMap<>();
        int count=0;

        for (int i = 0; i<a;i++){
            String input = br.readLine();
            if(!input.equals("ENTER")){
                if(!checkMap.containsKey(input)){
                    checkMap.put(input,0);
                    count++;
                }
            }else {
                checkMap.clear();
            }
        }
        System.out.println(count);

    }
}
