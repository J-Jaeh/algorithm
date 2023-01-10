class Solution {
    public long solution(int price, long money, int count) {

        long sum = 0;

        for (int i = 0; i < count+1; i++) {
            sum += i;
        }

        long totalPrice = price * sum;

        if (money - totalPrice > 0) {
            return 0;
        } else
            return totalPrice - money;
    }
}