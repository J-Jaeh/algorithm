import java.util.*;

class Main{
    public int[] solution(int n, int[] arr){
        for(int i=1;i<n;i++){
            int tmp = arr[i]; // 일 단 값을 저장 [5,3,8,9]      f ->tmp=3
            int j;
            for(j=i-1;j>=0;j--){//이건 조금식 조금씩 범위를 확장해가는 느낌..? f -> j=0 ,
                if(arr[j]>tmp){// 만약 기준보다 크다면~                    f -> ture , tmp가 더작다
                    arr[j+1]=arr[j]//기준이랑 자리바꿈?                   f -> 뒷인덱스에 앞인덱스값을 넣어줌
                }else break;
            }
            arr[j+1]=tmp;     //break 거나 멈춘값에서 tmp값 너줌,,        f -> j=-1 , arr[0]에 tmp 값 넣어줌..
        }
        return arr;
    }
}