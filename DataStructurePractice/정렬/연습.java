 import java.util.*;


class Main{

  public int[] solution1_삽입(int a, int arr){
   // 삽입의 기준...을 정해보면..  삼입되는 위치를 점점 늘려가는거겠지
    
    for(int i = 1; i<n;i++){
      int tmp=arr[i],j;
      for(int j =i-1;j>0;k--){
        if(arr[j]>tmp){   //[ 5 ,2  ,1  ,4 ]-> [ 5 , k , 1 , 4]
         arr[j]=arr[j+1] 
        }else break;
        arr[j]=tmp;
      }
      return arr;
  }
}
