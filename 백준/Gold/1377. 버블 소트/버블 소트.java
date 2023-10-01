import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        MData[] A = new MData[N];
        for(int i=0;i<N;i++){
            A[i]= new MData(Integer.parseInt(reader.readLine()),i);
            // value에 입력값이 들어가고  index에 i값이 들어가자나 이제 이걸 value 기준으로
            //오름차순 정렬하는거지
        }
        Arrays.sort(A);
        int Max = 0;

        for(int i=0;i<N;i++){
            if(Max<A[i].index - i)
                Max=A[i].index-i;
        }
        System.out.println(Max+1);
    }
}

class MData implements Comparable<MData>{
    int value;
    int index;

    public MData(int value, int index){
        super();
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(MData o){
        return this.value - o.value;
    }
}