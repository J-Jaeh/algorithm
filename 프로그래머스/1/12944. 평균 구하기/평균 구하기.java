class Solution {
    public double solution(int[] arr) {
        double temp=0;
        for(int a:arr){
            temp+=a;
        }
        double len = arr.length;
        double answer = temp/len;
        return answer;
    }
}