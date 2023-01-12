import java.util.ArrayList;

class Solution {
   public int solution(int num, int k) {
        int countN=0;
        int inNumber=0;
        ArrayList<Integer> numList = new ArrayList<>();

        while (num>0){
            numList.add(num%10);
            
            if(num%10==k){
                inNumber++;
            }
            num/=10;
         } // 거꾸로 담겨있음 [3,4,4,2,3,2] 1 
       // [6,5,4,3,2,1]  사이즈값이 5이다 근데 ? 마이너스 하나씩 하자나 그니까 아..//

        if(inNumber==0){
            return -1;
        }
        
        int size = numList.size()-1;

        for (int i = size;i>=0;i--){
            countN++;
            if (numList.get(i)==k){
                break;
            }
            
        }

        return countN;
    }
}