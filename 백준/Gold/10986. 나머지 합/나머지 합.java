import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 첫째 줄에 N과 M이 주어진다. (1 ≤ N ≤ 106, 2 ≤ M ≤ 103)
 *
 * 둘째 줄에 N개의 수 A1, A2, ..., AN이 주어진다. (0 ≤ Ai ≤ 109)
 */
public class Main {
    public static void main(String[] args) throws Exception{
        //일단 갯수가 있네 받아야겠지?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long number = Long.parseLong(st.nextToken());  // 갯수다 ~!
        long m = Long.parseLong(st.nextToken());

        //합배열 구해야겟지?
        StringTokenizer stringArray = new StringTokenizer(br.readLine());
        long[] accumulateArray = new long[(int)number+1];
        for(int i=1; i<number+1;i++){
            accumulateArray[i] = accumulateArray[i-1]+Long.parseLong(stringArray.nextToken());
        }
        for(int i=1;i<number+1;i++){
            accumulateArray[i] =accumulateArray[i]%m;
        }
        
        //Map을 이용하는게 어떨까요 ?
        long answer =0;
        Map<Long,Long> arrayMap = new HashMap<>();

        // 이러면 인덱스 0의 0은 고려 안해도 되고
        for (int i=1; i<number+1;i++) {
            Long l = accumulateArray[i];
            if(!arrayMap.containsKey(l)){
                arrayMap.put(l,(long)1);
            }else{
                arrayMap.put(l,arrayMap.get(l)+1);
            }
        }
      //0인거 특별 대우 해줘야지
        // 이게 NullPointer에러 나오는 원인이네 역시 강제로 주는건 안좋은듯
        //if지뭐야그럼
        if(arrayMap.containsKey((long)0)){
            answer += arrayMap.get((long) 0);
        }
        //여기서 이제 Map을 돌려 돌려 하면 되는거자나
        for (Long aLong : arrayMap.keySet()) {
            //경우의 수 계산
            Long count =arrayMap.get(aLong);
            long twoChoice=(count*(count-1))/2;
            answer+=twoChoice;
        }

        System.out.println(answer);
    }


}
