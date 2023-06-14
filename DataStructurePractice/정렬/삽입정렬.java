import java.util.*;

class Main{
    public int[] solution(int n, int[] arr){
        for(int i=1;i<n;i++){
            int tmp = arr[i]; // 일 단 값을 저장
            int j;
            for(j=i-1;j>=0;j--){//이건 조금식 조금씩 범위를 확장해가는 느낌..?
                if(arr[j]>tmp){// 만약 기준보다 크다면~
                    arr[j+1]=arr[j]//기준이랑 자리바꿈?
                }else break;
            }
            arr[j+1]=tmp;
        }
        return arr;
    }
}