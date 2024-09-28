class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        //[1, 4], [3, 2], [4, 1]]	[[3, 3], [3, 3]]	[[15, 15], [15, 15], [15, 15]]
        // 1 4    3  3     15  15    1x3 + 4x3      1x3  4 3
        // 3 2  x        = 15  15
        // 4 1    3  3     15  15
        // 3x2    2 x 2  =  3 x 2
        //                           k                     k 누적 ?
//        answer[0][0] = arr1[0][0]*arr2[0][0] + arr1[0][1]*arr2[1][0];
//        answer[0][1] = arr1[0][0]*arr2[0][1] + arr1[0][1]*arr2[1][1];
//
//        answer[1][0] = arr1[1][0]*arr2[0][0] + arr1[1][1]*arr2[1][0];
//        answer[1][1] = arr1[1][0]*arr2[0][1] + arr1[1][1]*arr2[1][1];

        for(int i = 0; i< arr1.length;i++){
            for(int j=0;j< arr2[0].length;j++){
              for(int k =0;k<arr2.length;k++){
                answer[i][j]+=arr1[i][k]*arr2[k][j];
              }
            }
        }
        return answer;
    }
}