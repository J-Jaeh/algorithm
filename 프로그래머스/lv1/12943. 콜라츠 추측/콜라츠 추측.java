class Solution {
    public int solution(int num) {
        int count = 0;
        
        long numLong = num;
        
        while (numLong>1){
            
            if(numLong%2==0){
                numLong/=2;
            }else {
                numLong *=3;
                numLong ++;
            }
            
            count++;
        }
        
        if(count>500){
            return -1;
        }
        else{
            return count;
        }
    }
}