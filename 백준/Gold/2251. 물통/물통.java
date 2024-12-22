import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    // 3차원인이유 3개의 물통의 방문여부와 조합을 기록하기위해 ./..
    static boolean[][][] visited;
    static boolean[] result;
    static int[] capa = new int[3];

    public static void main(String[] args) {
        // A B C C는 가득차있음
        /*
         조건 1 . 물통이 가득채울때 or 다부을때까지 정지 불가
         조건 2 . A 가 비어있을때 가능한 C에 담겨있을 수 있는 물의양을 전부 구해라
         조건 3 . 오름차순으로 정렬해서 출력
         -- > 전에 파이썬으로는 dfs를 이용해서 풀음 .. 나 재귀도 잘 이용했나보네 ㅁㅊ;ㅣ;
         */
        Scanner sc = new Scanner(System.in);
        capa[0] = sc.nextInt();  // A
        capa[1] = sc.nextInt();  // B
        capa[2] = sc.nextInt();  // C 각각 최대용량

        int A = capa[0];
        int B = capa[1];
        int C = capa[2];

        visited = new boolean[A+1][B+1][C+1];
        result = new boolean[C+1];

        bfs(0, 0, C);
        for (int i = 0; i < C+1; i++) {
            if (result[i]) {
                System.out.print(i + " ");
            }
        }
    }

    static void bfs(int a, int b, int c) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{a, b, c});

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int A = now[0];
            int B = now[1];
            int C = now[2];

            if (A == 0) result[C] = true;

            // 물을 옮기는 경우를 체크하기 위함 .. !
            for (int f = 0; f < 3; f++) {
                for (int t = 0; t < 3; t++) {
                    if (f == t) continue;
                    int[] newComb = calComb(A, B, C, f, t);
                    int nA = newComb[0];
                    int nB = newComb[1];
                    int nC = newComb[2];
                    if (!visited[nA][nB][nC]) {
                        visited[nA][nB][nC] = true;
                        q.add(new int[]{nA, nB, nC});
                    }
                }
            }

        }
    }

    // 어차피 초반 a, b 에서 옮기는건 다 빵구가 남
    // f 의 c 부터가 시작임
    // 2 -> 0 즉 C-> A 시작

    static int[] calComb(int a, int b, int c, int f, int n) {
        int[] current = new int[]{a, b, c};
//        System.out.println(a + " " + b +" " + c  + " " + f + " "+n);
        //   현재 내가 가지고 있는양  vs 보낼곳의 여유 중 적은것
        int avail = Math.min(current[f], capa[n] - current[n]);
//        System.out.println(avail);
        current[f] -= avail;
        current[n] += avail;
        return current;
    }

    /*
     ! /. 아 오름차순이라면 boolean 배열을 이용해서 나중에 체크해서 넘어가면되는구나
     */
}
