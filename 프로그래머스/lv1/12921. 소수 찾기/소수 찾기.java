class Solution {
    public int solution(int n) {
        int count = 0;
        
        int[] sosuNumber = new int[n+1]; // 인덱스로 소수찾는다고 했는데

        for (int i =2 ; i<sosuNumber.length;i++) {
            if(sosuNumber[i]==0){
                count++;
                for(int j = i ; j<sosuNumber.length;j+=i ){
                    sosuNumber[j]=-1;
                }
            }
        }
        return count;
    }

}