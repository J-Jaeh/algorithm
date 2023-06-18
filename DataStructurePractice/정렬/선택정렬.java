 import java.util.*;

class Main{
    public int[] solution(int n , int[] arr){
        for(int i =0; i<n-1;i++){
            int idx=i;
            for(int j=i+1;k<n;j++){
                if(arr[j]<arr[idx]) idx=j;  // 여기서 가장 작은값이 나온다... 아.. 작은값을 index값으로 ..
            }
            int tmp = arr[i]; // i값을 일시적으로 저장
            arr[i]=arr[idx] //찾은 최소값을 i값으로 바꿈
            arr[idx]=tmp // 맞교환이라고 생각
        }

        return arr;

    public void static main(String[] args){

    }

}