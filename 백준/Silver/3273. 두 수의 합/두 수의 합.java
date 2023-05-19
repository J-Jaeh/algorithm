import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        int firstValue = Integer.parseInt(sb.readLine());

        int[] ints = new int[firstValue];

        StringTokenizer st = new StringTokenizer(sb.readLine());

        for(int i = 0;i<firstValue;i++){
            ints[i] = Integer.parseInt(st.nextToken());
        }
        //배열 완성! 후에 세번째 값까지 받음//
        Arrays.sort(ints);
        int thirdValue = Integer.parseInt(sb.readLine());

        int lt = 0;
        int rt = firstValue-1;
        int answer = 0;

//        9
//        5 12 7 10 9 1 2 3 11
//        13
        // 혹시 솔팅하고 하면 좀 편할라나 ?
        // 솔팅하면 1 2 3 5 7 9 10 11 12 오
        // 이러면 ~ 봐봐
        // lt=1 이고 rt는 12야
        // 더해 13? 증가
        // lt 증가 rt 감소 13 오? 그럼 한번더반복
        // 3 11 오 만족 못하네 ? 14야 13보다 크니까 rt를감소
        // 3 10 오 만족함 증 감
        // 5 9 14 네? rt 감소 5 7  12네? lt증가
        //그냥 rt lt의 움직임을 제한하는게 더 좋은 방법 일지도 ?
        while (lt<rt){
            int compare =ints[rt] + ints[lt];
            if(compare==thirdValue) {
                answer++;
                rt--;
                lt++;
            }
            else if (compare>thirdValue) {rt--;
            }else lt++;
        }
        System.out.println(answer);
    }
}