class Solution {
    public int solution(int num) {

        if(num==1){
            return 0;
        }

        int count = 0;

        while (num>1){

            if(num%2==0){
                num/=2;
            }else {
                num*=3;
                num++;
            }
            count++;
        }

        if(count>500){
            return -1;
        }
        else{
            return num;
        }
    }
}
