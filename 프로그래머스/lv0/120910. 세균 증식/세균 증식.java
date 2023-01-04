class Solution {
    public int solution(int n, int t) {
        int count =0;
        int compare = n;
        while(count<t){
            n*=2;
            count++;
        }
        return n;
    }
}