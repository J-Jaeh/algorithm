import java.util.ArrayList;

class Solution {
     public int solution(int n) {


    //3^0,3^1,3^2,3^3,
    //0,0,2,1
    //2*9 + 1*27

        ArrayList<Integer> arrayList = new ArrayList<>();


    //10진법을 어떻게 3진법으로 바꿈 ? 3으로 나눔 ?

    while(n>0){
        //45 -> 15 ->5 ->3,2
        // 일단  0    0   2 //!!1 ///

        //125 -> 123 ->41 ->39 ->13 -> 12 ->4 -> 3
            //  2         2          1       1   //1

        if(n%3==0){
            arrayList.add(0);
            n/=3;
        } else if ((n-1)%3==0){
            arrayList.add(1);
            n = (n-1)/3;
        }else if((n-2)%3==0){
            arrayList.add(2);
            n = (n-2)/3;
        }
        //이게 뒤집혀진 결과이고 ..!
    }
        int answer = 0;
        int tree = 1;
    for(int i = arrayList.size()-1; i>=0;i--){
        answer += arrayList.get(i)*tree;
        tree*=3;
    }
        return answer;

    }
}