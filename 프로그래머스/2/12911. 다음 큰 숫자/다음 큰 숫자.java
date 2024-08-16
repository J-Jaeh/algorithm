class Solution {
    public int solution(int n) {
        int numOnes = Integer.bitCount(n); // n의 이진수에서 1의 개수
        
        while (true) {
            if (Integer.bitCount(++n) == numOnes) { // 다음 숫자의 1의 개수가 동일한지 확인
                return n;
            }
        }
    }
}
