import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 3개의 값이 들어온다  N 은 갯수  targetNumber 는 나와야하는 값
        int N = Integer.parseInt(br.readLine());
        long targetNumber = Long.parseLong(br.readLine());

        //배열로 만들어 줄것.
        StringTokenizer st = new StringTokenizer(br.readLine());

        //배열을 채움
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());
            numbers[i] = number;
        }

//        6
//        9
//        2 7 4 1 5 3// 고유한 번호라면 중복이 없다는 뜻이니까 정렬을 하자     -> 2
        int[] sortedNumbers = Arrays.stream(numbers).sorted().toArray();
        int count = 0, r = N - 1, l = 0;

        while (l<r){
            int sum =sortedNumbers[r]+sortedNumbers[l];
            if(sum==targetNumber){
                count++;
                r--;
                l++;
            }else if(sum>targetNumber){
                r--;
            }else
                l++;
        }
        System.out.println(count);

    }

}
