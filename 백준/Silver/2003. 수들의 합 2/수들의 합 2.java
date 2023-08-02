import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N개의 수로 된 수열 A[1], A[2], …, A[N] 이 있다.
 * 이 수열의 i번째 수부터 j번째 수까지의 합 A[i] + A[i+1] + … + A[j-1] + A[j]가
 * M이 되는 경우의 수를 구하는 프로그램을 작성하시오.
 */
public class Main{
    /**
     * 첫째 줄에 N(1 ≤ N ≤ 10,000), M(1 ≤ M ≤ 300,000,000)이 주어진다.
     * 다음 줄에는 A[1], A[2], …, A[N]이 공백으로 분리되어 주어진다. 각각의 A[x]는 30,000을 넘지 않는 자연수이다.
     */
    public static void main(String[] args) throws Exception {
        //첫줄에 n m 이 주어짐

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken()); // 이값이 되면 카운트를 하면됨


        //인덱스 번호가지고만 해도 되나
        //그럴빠에는 ..?
        //일단 ..
        long[] array = new long[n];  //n개의 배열을 생성한다
        //일단 값을 채워서 줘야겠지 ?
        StringTokenizer nb = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Long.parseLong(nb.nextToken());
        }
        //일단 배열은 셋팅 되었고 ~
        //투 포인터를 생성
        int start = 0;
        int end = 0;
        int countM =0;
        long sum= array[end]; // 이렇게 하면 안되는게 문제가 뭐냐면 ... 처음에 만약에 같은수자나 그러면 그걸 걸러주지 못해 ~.~ 즉 0으로 시작해야됨 아니 end의 첫값만 넣어주면 되자나 ?
        // 마지막 수에만 값이 있을경우... 그걸 추가하는 방법을 찾아야함
        //
        while (start!=n){
            if(end==n-1) {
                if (sum == m) {
                    countM++;
                    break;
                } else {
                sum -= array[start];
                start++;
                continue;
            }
            }
            if(sum==m){
                end++;
                sum+=array[end];
                countM++;
                ;// 아 sum을 초기화 시키면 안되는구나; 일단 ok
            }else if (sum<m) {
                end++;  // 이건 더하고 늘리는게 맞고
                sum+=array[end];
            }else if(sum>m){
                sum-=array[start];//일단 빼고 늘리는게 맞고 ~
                start++;
            }
        }
        System.out.println(countM);
    }

}
