

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 오큰수 구하기 - 스택
 */
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] A = new int[n];
        int[] ans = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i =0; i<n;i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> myStack = new Stack<>();
        myStack.push(0); // 0 번인덱스.. 왜냐면 처음에는 비어있는 스택이니까 비교를 위해 
        for (int i = 1; i < n; i++) {
            while (!myStack.isEmpty() && A[myStack.peek()] < A[i]) { //그니까 비어있지 않거나 스택상단에서 꺼넨 인덱스의 해당하는 값이 현재 비교하고 싶은 인덱스보다 크만 다음단계
                ans[myStack.pop()] = A[i];
            }
            myStack.push(i);
        }
        while (!myStack.empty()) {
            ans[myStack.pop()]=-1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            bw.write(ans[i]+" ");
        }
        bw.write("\n");
        bw.flush();
    }

}
