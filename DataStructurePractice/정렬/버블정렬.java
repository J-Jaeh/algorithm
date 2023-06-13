import java.until.*;

class Main{

    public int[] solution(int n, int[] arr){
        for(int i=0;i<n-1;i++){
            for(int j=0;<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp
                }
            }
        }
        return  arr;

    }
}