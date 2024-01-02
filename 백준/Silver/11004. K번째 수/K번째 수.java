import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    /* 정렬을 하는 것만이 아닌.. k번째의 수를 찾는 것이 목적
     이건 추가로 quick sort 와 quick select 를 공부..!~
     1. pivot == k 알고리즘 종료
     2. pivot > K  찾는 값은 왼쪽에 있으니 왼쪽만 정렬 수행
     3. 반대의 경우는 찾는 값이 오른쪽에 있다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        quickSort(A,0,N-1,K-1);
        System.out.println(A[K-1]);
    }


    private static void quickSort(int[] A, int S, int E, int K){
        if(S<E){
            int pivot = partition(A,S,E);
            if (pivot==K) return;
            else if(K<pivot) quickSort(A,S,pivot-1,K);
            else quickSort(A,pivot+1,E,K);
        }
    }

    private static int partition(int[] A, int S, int E){
        if(S + 1==E){
            if(A[S]>A[E]){
                swap(A,S,E);
                return E;
            }
        }
        int M =(S+E)/2;
        swap(A,S,M);  /// 중앙값을 1번째 요소로 바꿔주는것임 이유는 S E를 편하게 하기 위해서,
        int pivot = A[S];
        int i = S+1, j=E;
        while (i<=j){
            while (pivot<A[j]&&j>0){  // pivot보다 작은 수가 나올 때 까지 j--
                j--;
            }
            while (pivot>A[i]&&i<A.length-1){ // pivot보다 큰수가 나올 때까지 i++
                i++;
            }
            if(i<=j){
                swap(A,i++,j--);
            }
        }
        // i==j 피벗의 값을 양쪽으로 분리한 가운데에 오도록 설정하기 ? 그니까 기준선이 되도록 ...
        A[S] = A[j];
        A[j]=pivot;
        return j;
    }
    private static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i]=A[j];
        A[j]=temp;
    }

}
