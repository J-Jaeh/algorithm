class Solution {
    public int solution(int n, int t) {
        int count =0;
        
        while(count<t){
            n*=2;
            count++;
        }
        return n;
    }
}