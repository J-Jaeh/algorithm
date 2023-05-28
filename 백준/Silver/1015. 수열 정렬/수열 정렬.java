import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] argus) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int firstV = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arrays =new int[firstV];

        for(int i=0;i<firstV;i++){
            arrays[i]=Integer.parseInt(st.nextToken());
        }
        //비내림차순.. 바로앞 원소보다 크거나 같을경우
        //
        //세팅 끝
        //아니 stack + map 이용하면 될거같은데 ?

// 뭐야 그니까 오름차순으로 만들때 필요한 인덱스를 출력하라는거네
        // 존나 말을 어렵게합니다 진짜
        //흠.. 그냥 sort쓰면 안되냐
        int[] clone = arrays.clone();
        Arrays.sort(arrays);
        //[1,1,1,3,4,4,6,6]
        // 어레이는 이제 그걸로 된거고 오름차순
        //이제 answer에다가 각각의 값에 대한 인덱스 번호를 넣어줄꺼야
        //근데 이제 넣어주고나서 원본 배열은 -1처리해주는거야
        int[] answer = new int[firstV];
        for (int i =0;i<firstV;i++) {
            for (int j=0;j<firstV;j++) {
                if(clone[i]==arrays[j]){
                    answer[i]=j;
                    arrays[j]=-1;
                    break;
                }
            }

        }
        for(int i =0;i<firstV-1;i++){
            System.out.print(answer[i]+" ");
        }
        System.out.print(answer[firstV-1]);
    }


}
