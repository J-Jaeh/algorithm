class Solution {
    public int solution(int[] array, int n) {
        int count = 0;
        for(int i : array){
            if (i ==n){
                count +=1;
            }
        }
        return count;
    }
}