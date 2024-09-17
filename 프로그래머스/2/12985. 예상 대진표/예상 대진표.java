class Solution
{
    public int solution(int n, int a, int b) {
        int round = 1;
        // 1 - 2 -> 1
        // 4-> 2 -> 1 ->
        // 7-> 3 -> 2 ->
        // 1   2    3
        while (!meet(a,b)) {
            //체크
            a=odd(a);
            b=odd(b);
            round++;
        }
        
        return round;
    }
    // -1 하고 2를 나눈 값이 같다면 만났다 ~
    private boolean meet(int a, int b){
        int f = (a-1)/2;
        int s = (b-1)/2;
        return f == s ;
    }
    
    private int odd(int a ){
        if(a%2 == 0){
            a=a/2;
        }else{
            a=(a+1)/2;
        }
        return a;
    }
}