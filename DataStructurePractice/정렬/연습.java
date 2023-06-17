 import java.util.*;


class Main{

  public int[] solution_삽입(int a, int[] arr){
   // 삽입의 기준...을 정해보면..  삼입되는 위치를 점점 늘려가는거겠지
    
    for(int i = 1; i<n;i++){
      int tmp=arr[i],j;
      for(int j =i-1;j>0;k--){     // j>=0 까지 가야함 ! 이건 맞는말 같은데;
        if(arr[j]>tmp){   //[ 5 ,2  ,1  ,4 ]-> [ 5 , 2 , 2 , 4] 사실 이게 되는거지?
         arr[j+1]=arr[j]       // 여기선 arr[j+1]=arr[j]
          // 이렇게 되고 ... 그니까 tmp는 기억해놨으니까 배열에도 없어져도 상관없자나
          // 그러다가 에러만나면 브뤸크..
        }else break;
                   
      }
     arr[j+1]=tmp; // arr[j+1]=tmp를 넣네 .. ?  이유는 ... ? 없어진 tmp값이 들어갈 위치를 정하는것.
    // j는 -1에서 끝나거나 break에서 끝나니까...? 그거보다 오른쪽 인덱스 값을 집어넣어야함..!
     
  }
   return arr;
  }
 
   public int[] solution_선택(int n , int[] arr){
      //선택 정렬이 되려면... 일단 기준하나를 잡고 j는 그것보다 크고...
    for(int i =0;i<n-1;i++){
      int temp = arr[i]; // 일단 최솟값을 저장하는거시여~.
      int index; // 왜냐면 자리를 바꿀 j의 인덱스를 알아야하자나...
     for(int j = i+1; j<n ; j++){
        if(temp>arr[j]){
          //작은값이 계속 업데이트가 되어야하자나
          temp = arr[j];
          index = j;
        } 
     }
     //이렇게 한바퀴를 돌고나면 .. 가장작은값은 temp!
     arr[index]=arr[i];
     arr[i]=temp; 
   }
    return arr;
  }
 
}
