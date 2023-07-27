import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws Exception  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer split = new StringTokenizer(br.readLine());

        int numbers = Integer.parseInt(split.nextToken());

        // 계산 값을 반환 해야하는 횟수!
        int line = Integer.parseInt(split.nextToken());

        StringTokenizer st = new StringTokenizer(br.readLine());
        //흠 인트 배열을 담고 싶은데 ...
        int[] number_array = new int[numbers];
        // 이러면 인트 배열이 만들어지니... 구간합을 배열을 만들어보자 ! .
        for(int i =0 ; i<numbers;i++){
            int data = Integer.parseInt(st.nextToken());
            number_array[i] = data;
        }

        int[] savePlusNumberArray = new int[numbers]; // 누적합을 만들꺼야
        //누적 누적 ~
        for(int i =0 ;i<numbers;i++){
            if(i==0){
                savePlusNumberArray[i]=number_array[i];
            }else{
                savePlusNumberArray[i]=number_array[i]+savePlusNumberArray[i-1];
            }
        }
        //[5 4 3 2 1]
        //[5 9 12 14 15]
        // if 1 3 을 원했다 ?
        // 2- 4
        // if 4-5의 구간합을 원해 ? 차이 가 1 이네 ? 하나더빼야되넴? -2 ?
        // 인덱스 기준 4-3
        //  3 - 5 는 ?  4-2
        // 즉 같은 구간 인덱스의 차이를 원해 ?
        //  4 4 라면 2 가 나와야하지 이때 그러면 3-2 가되지  오 되네?
        /// 만능 가능 ?
        // 아니지 /// 1 -1 이;면 어쩔 건데 ? 5가 나와야하자나 ;
        // 그니까 같은 경우는 아래가 더 편한게 맞고
        // 이제 차이가 나는 경우를 따져야지
        // 첫번째 벨류가 1 이야 그럼 두번째 벨류느,ㄴ 무조건 2이상이자나
        // 

       for(int i=0;i<line;i++){
           StringTokenizer value = new StringTokenizer(br.readLine());
           int firstValue = Integer.parseInt(value.nextToken());
           int secondValue = Integer.parseInt(value.nextToken());

           if(firstValue==secondValue){
               System.out.println(number_array[firstValue-1]);
           }else if (firstValue==1){
               System.out.println(savePlusNumberArray[secondValue-1]);
           }else {     // 만약 2 ~ 3 의 구간 합을 구해야해 ?  7이 나와애해  인덱스 2-0 
               System.out.println(savePlusNumberArray[secondValue-1]-savePlusNumberArray[firstValue-2]);
           }

       }

    }
}


