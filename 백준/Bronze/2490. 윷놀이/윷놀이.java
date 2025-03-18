import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i =0;i<3;i++){
            System.out.println(answer(br.readLine().split(" ")));
        }
    }

    private static String answer(String[] inputs){
        int sum = Arrays.stream(inputs)
                .mapToInt(Integer::parseInt)
                .sum();
        switch (sum){
            case 0 : return "D";
            case 1 : return "C";
            case 2 : return "B";
            case 3 : return "A";
            case 4 : return "E";
        }
        return "-1";
    }
}
