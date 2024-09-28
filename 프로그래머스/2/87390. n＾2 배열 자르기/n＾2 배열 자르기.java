class Solution {
 public static long[]  solution(int n, long left, long right) {
        // n*n  2차원배열 을만들고
        // i 행 i 열까지 i로 채운다
        // 1차원 배열 만든다 ! 로우로
        // // arr[left]~ arr[right]
        // 1 2 3
        // 2 2 3    세로 축은 몫이고 나머지로 시작위치를 정하는거 아닐가 ?
        // 3 3 3 .. 하나씩 이군 .. ! 그렇다면 ~ 이제
        long[] answer = new long[(int) (right-left+1)];

        long s = left/n; // 1줄은 0부터시작

        for(int i =0;i< (right-left+1);i++){
            long num = (i+left%n) % n ;// 0 1 2 3 4 5...
//            System.out.println(num);
//            System.out.println(s+1);
//            System.out.println();
            if(num<s+1){
                answer[i]=s+1;
                continue;
            }
            if (num +1  == n){
                s++;
            }
            answer[i]=num+1;
        }
//        for (int i : answer) {
//            System.out.println(i);
//        }
        return answer;
    }
}