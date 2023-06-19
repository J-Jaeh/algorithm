import java.util.*;

class Main{
    public String solution(int n, int[] arr){
        String answer = "U";
        Arrays.sort(arr); // 근데 .. 이건 그냥 정렬 아님? 정렬 과정중에... 중복된게 있는걸 알려주는게.. 더좋은 방법아닌가?

        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]) return "D";
        }

        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        Systme.out.println(T.solution(n.arr));
    }
}
