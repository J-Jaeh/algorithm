import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int N;
    static String[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
         map = new String[N][N];
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().split("");
        }
//        for (String[] strings : map) {
//            System.out.println(Arrays.toString(strings));
//        }
        System.out.println(trip(0, 0, N));

    }

    static String trip(int x, int y, int size) {
        if(check(x,y,size)){
            return map[x][y];
        }
        //그게 아니라면 4등분.
        int half = size / 2;

        return "(" +
                trip(x, y, half) + //왼쪽 위
                trip(x, y + half, half) + //오른쪽 위
                trip(x + half, y, half) + //왼쪽 아래
                trip(x + half, y + half, half) + //오른쪽 아래
                ")";

    }

    static boolean check(int x, int y, int size) {
        String first = map[x][y];
        for(int i = x; i< x+size;i++){
            for(int j = y; j<y+size;j++){
                if(!map[i][j].equals(first)) return false;
            }
        }
        return true;
    }
}
