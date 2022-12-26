class Solution {
public boolean solution(int x) {
        int countSum=0;
        
        int a = x;

        while (x!=0){
            countSum+=x%10;
            x/=10;
        }

        if((a%countSum)==0){
            return true;
        }else{
            return false;
        }

    }
}