import java.util.*;
class Main{
    public int count(int[] arr, int dist){
        int cnt=1;
        int ep=arr[0];
        for(int i=1, i<arr.length;i++){
            if(arr[i]-ep>=dist)
                cnt++;
                ep=arr[i];
        }
        return cnt;
        
    }

    public int solution(int n, int c , int[] arr){
        int answer=0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        while (lt<=rt){
            int mid =(lt+rt)/2;
            if(count(arr,mid)>=c){
                answer=mid;
                lt=mid+1; // 찾은값이... 있다면 범위를 좁혀야하는데 그니까 큰수를 줄어야지..!
            }
        }
        return answer;
    }


    public static void main(string[] args){
        Main T = new Main();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int c = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, c, arr));
    }
}

