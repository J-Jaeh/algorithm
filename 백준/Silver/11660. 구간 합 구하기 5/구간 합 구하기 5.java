import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int solveNum = Integer.parseInt(st.nextToken());

        int[][] pan = new int[size+1][size+1]; //    배열에는 long q불가능?

        int[][] plusNum = new int[size+1][size+1];

        for (int i = 1; i <= size; i++) {
            StringTokenizer number = new StringTokenizer(br.readLine());
            for (int j =1; j <= size; j++) {
                pan[i][j] = Integer.parseInt(number.nextToken());
            }
        }
        //합배열 세팅 ;; 2차원 을 기억하셈 !
        for (int i = 1; i <= size; i++) {
            for(int j =1; j <= size; j++) {
                plusNum[i][j]=plusNum[i][j-1]+plusNum[i-1][j]-plusNum[i-1][j-1]+pan[i][j];
            }
        }
                //공식 대입 합배열은 .....
        for (int i = 1; i <= solveNum; i++) {
            StringTokenizer answer = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(answer.nextToken());
            int y1 = Integer.parseInt(answer.nextToken());
            int x2 = Integer.parseInt(answer.nextToken());
            int y2 = Integer.parseInt(answer.nextToken());

            int sum = plusNum[x2][y2]-plusNum[x2][y1-1]-plusNum[x1-1][y2]+plusNum[x1-1][y1-1];
            System.out.println(sum);
        }


    }
}
