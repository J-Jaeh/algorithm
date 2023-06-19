import java.util.*;

class Main {
    public int[] solution(int size;

    int n, int[] arr)

    {
        int[] cache = new int[size];
        for (int x : arr) {
            int pos = -1; // 위치
            for (int i = 0; i < size; i++) if (x == cache[i]) pos = i; //x값이 캐시에 있다면 있는 인덱스를 저장;;

            if (pos == -1) {
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }

            } else {
                for (int i = pos; i >= 1; i--) { //히트인경우 .. 히트인 자리부터... 뒤로 밀리기..
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;// 한번만 해줘도 됨... ! 각각의 경우에 해주는것보단 .. 어차피 0번 인덱스에 들어가니까..
        }
        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(Systme.in);
        int s = kb.nextInt();
        int n = kb.nextInt();cv
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();

        for (int x : T.solution(s, n, arr)) System.out.print(x + " ");

    }
}