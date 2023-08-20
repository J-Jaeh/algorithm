
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
 
    public static void main(String[] args) throws Exception{
        //문제
        //N개의 수A[1~N] 주어진다
        //L이주어진다
        //A[i-L+1] ~A[i] 중 최숫값을 D[] 라고할때 /// D에 저장된 수를 출력
        // i<=0은 무시한다 .. 음 ?! 이것도 중요 .. 아예 무시한다는 뜻이 아님 [0] ~ [1] 이렇게도 포함된다는 말...
        //if i가 3이고 l이 3이면 A[1]~A[3] 의 수 에서 최소 값을 D에저장
        // 그리고 슬라이딩 인덱스 가는거겠지?
        // i 4가되고 그럼 A[2]~A[4] 중 최솟값을 D에 저장 ..
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 오 .. 이런게 있었넹

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 갯수..
        int L = Integer.parseInt(st.nextToken()); // 슬라이딩 사이즈.
        st = new StringTokenizer(br.readLine()); // 총 A값 세팅.... 하면서 정렬을 한다고 ? 와 // 미쳣네;.

        Deque<Node> mydeque = new LinkedList<>(); // 아 .. index를 명시해야줘하는 이유가 있나..
        for(int i=0;i<N;i++){
            int now = Integer.parseInt(st.nextToken());
            //새로운 값이 들어올때마다 정렬 대신 현재 수 보다 큰 값을 덱에서 제거해...시간복잡도를 줄인다고..?
            while(!mydeque.isEmpty() && mydeque.getLast().value>now){
                mydeque.removeLast();
            }
            mydeque.addLast(new Node(now,i));
            
            //범위에서 벗어난 값은 덱에서 제거...
            if(mydeque.getFirst().index<=i-L){  //..?  i-L은 뭔데? is 범위 ? 만약에 지금 인덱스가 2야? 그럼 작아질려면 .. i는 계속 증가해서..? 
                mydeque.removeFirst();
            }
            bw.write(mydeque.getFirst().value+" ");
        }
        bw.flush();
        bw.close();
    }
    private static class Node{
        public int value;
        public int index;
        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
