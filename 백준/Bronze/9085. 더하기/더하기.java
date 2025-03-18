import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int i =0;i<tc;i++){
            int len = Integer.parseInt(br.readLine());
            String[] inputs = br.readLine().split(" ");
            System.out.println(answer(inputs));
        }

    }
    private static int answer(String[] inputs){
        return  Arrays.stream(inputs)
                .mapToInt(i -> Integer.parseInt(String.valueOf(i)))
                .sum();
    }
}
