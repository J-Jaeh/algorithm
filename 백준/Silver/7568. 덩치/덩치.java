
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] argus) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int firstV = Integer.parseInt(br.readLine());

        int[][] input = new int[firstV][2];
        // firstV 만큼의 데이터를 입력 받아야 실행되는거!~
        for (int i = 0; i < firstV; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }

        }

        //조건이 있음 덩치 등수는 자기보다 더 큰 덩치가 있을때만 +1
        // 즉 모두가 큰게 +1임~.~
        //이거 그냥 하면 될거같은뎅;;
        //이중포문 돌려서 하나하나 검사해서 +해서 배열저장하면 되는거 아닌가 ?
        //break를 적절하게 섞으면 좋을듯..
        int[] answer = new int[firstV];//정답을 담을 배열

        for(int i=0;i<firstV;i++){
            int count =1;
            //A기준으로 고정시켜 ~
            for(int j=0;j<firstV;j++) {
                if (input[i][0] < input[j][0] && input[i][1] < input[j][1]) {
                    count++;
                }
            }
            answer[i] = count;
        }

        for(int i =0;i<firstV-1;i++){
            System.out.print(answer[i]+" ");
        }
        System.out.print(answer[firstV-1]);
    }

}
