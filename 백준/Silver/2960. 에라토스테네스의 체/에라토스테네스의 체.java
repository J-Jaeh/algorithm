import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { 
    public static void main(String[] argus) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] chae = new int[a + 1];

        int c = 0;

        int answer =0;
    // i와 j 잘 구분하기
        for (int i = 2; i < a + 1; i++) {
            if (chae[i] == 0) {
                    for (int j = i; j < a + 1; j += i) {
                       if(chae[j]==0) {
                           chae[j] = 1;
                           c += 1;
                           if (c == b) {
                               answer = j;
                           }
                       }
                    }

            }
        }
        System.out.println(answer);

    }
}
