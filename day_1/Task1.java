public class Task1 {
    static class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length < 2) {
                return 0;
            }

            int minPrice = Integer.MAX_VALUE;
            int profit = 0;

            int currentPrice;
            for (int i = 0; i < prices.length; ++i) {
                currentPrice = prices[i];
                minPrice = Math.min(minPrice, currentPrice);
                profit = Math.max(profit, currentPrice - minPrice);
            }

            return profit;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
