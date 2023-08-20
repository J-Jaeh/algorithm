        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.*;
/**
 * 9 8
 * CCTGGATTG
 * 2 0 1 1
 */
class Main{

    static int checkArr[]; // 아 이렇게 공용으로 사용하면 .. 되는군
    static int myArr[];
    static int checkSecret;// 이게 가장 이해가 안되는 부분.. 1
    public static void main(String[] args) throws IOException {
        //큐  map S-W 이용할꺼
        //값만 세팅해놓자
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int Result =0;
        char[] A = new char[S]; // S의 크기만큼 .. .배열의 크기를 생성
        checkArr = new int[4];
        myArr = new int[4];
        checkSecret=0;
        A=br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++){
            checkArr[i]=Integer.parseInt(st.nextToken());
            if(checkArr[i]==0) checkSecret++; //0인경우는 .. 체크해주는건가?
        }
        for(int i =0; i<P;i++){ //초기 P부분 문자열 처리부분이라는데 ... 일단 OK:
            Add(A[i]);//오른쪽에 더해주는함수
        }
        if(checkSecret==4) Result++;

        //슬라이디ㅣㅇ 윈도우... 위에서 P부분 처리햇으니까 P부터 시작하는거고... 슬라이딩 윈도우 S까지 진행하는거//
        for(int i=P;i<S;i++){
            int j=i-P;   //이러면 j는 0부터... 1~~~에서 ... 슬라이딩 윈도우 의 왼쪽 끝점까지 가네
            Add(A[i]);//오른쪽에 더해주고
            Remove(A[j]);//왼쪽에 더해주는 ㅎ마수 오 ..
            if(checkSecret==4) Result++;
        }
        System.out.println(Result);
    }
    private static void Add(char c){
        switch (c){
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }
    private static void Remove(char c){//아 빠져나간 수를 빼주는구나 ... 올 ;;;
        switch (c){
            case 'A':
                if (myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;  // 이제 이해 빠진다 면 빠지겠소. 
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':

                if (myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }
}