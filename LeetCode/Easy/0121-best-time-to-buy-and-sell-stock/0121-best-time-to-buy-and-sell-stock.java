class Solution {
    public int maxProfit(int[] prices) {
        int sizeOfDp = prices.length;
        // 최댓값 찾아야하니까 0이 맞고 ...
        if (sizeOfDp == 1) return 0;

        int min_price = Integer.MAX_VALUE;
        int max_profit=0;

        for (int price : prices) {
            if (min_price>price) min_price=price;
            else if (price-min_price>max_profit) {
                max_profit=price-min_price;
            }
        }
     return max_profit;
    }
}