import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
    //입력
//    6
//20 1 15 8 4 10
    static int maxV=0;
    static List<Integer> inputList;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            list.add(sc.nextInt());
        }
        inputList=list;
        recur(new ArrayList<>(),N);
        System.out.println(maxV);
    }

    private static void recur(List<Integer> input, int N){
        if(input.size() == N){
            // 여기서 맥스값 비교 갱신 하고
               int temp =0;
               for(int i =0;i<N-1;i++){
                   temp+=Math.abs(inputList.get(input.get(i))-inputList.get(input.get(i+1)));
               }
               if(temp>maxV) maxV=temp;

               return;
        }
        // 인덱스 값이아닌 오브젝트 값이 나오자나 그걸 리스트에 넣어 그렇다면 ... 인덱스를 찾는게 아니넹 ?
        // input 에는 인덱스 값이 담겨야 할것같ㅇ느딩 ..
        for (int i = 0; i < N; i++) {
            if(!input.contains(i)){
                input.add(i);
                recur(input,N);
                input.remove((Integer) i);
            }
        }
    }
}
