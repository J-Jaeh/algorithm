import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] argus) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int goalV = Integer.parseInt(br.readLine());

        int value = 64;
        // 64 32 16 8 4/ ? 23 어떻게 만들어 ㅡㅡ
        // 아 막대 붙이는게 중요하구나
        // 64 32 16 8 4 2 1
        // 23 이라면 16 4 2 1 이렇게 4개 구나 ㅋㅋ
        int count = 1;
        while (goalV != value) {
            if (goalV - value >= 0) {
                goalV -= value;
                count++;
            } else {
                value /= 2;
            }

        }
        System.out.println(count);
    }

}
