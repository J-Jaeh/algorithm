import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main { 
    static int[][] map;
    static int n, m;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        int x = 0, y = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int dot = Integer.parseInt(st.nextToken());
                if (dot == 2) {
                    x = j;
                    y = i;
                    map[i][j] = 0; 
                } else if (dot == 1) {
                    map[i][j] = -1;  // 조건이있었음 문제 똑바로 읽기 갈수없는 -1...
                } else {
                    map[i][j] = 0; 
                }
            }
        }

        bfs(x, y);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(map[i][j]);
                if (j < m - 1) {
                    sb.append(" ");
                }
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int cX = poll[0];
            int cY = poll[1];

            for (int i = 0; i < 4; i++) {
                int nX = cX + dx[i];
                int nY = cY + dy[i];
                if (0 <= nX && nX < m && 0 <= nY && nY < n && map[nY][nX] == -1) {
                    queue.offer(new int[]{nX, nY});
                    map[nY][nX] = map[cY][cX] + 1; 
                }
            }
        }
    }
}
