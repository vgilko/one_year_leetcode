public class Task1 {
    static class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length < 2) {
                return 0;
            }

            int maxPrice = 0;

            for (int i = 0; i < prices.length; ++i) {
                for (int j = i; j < prices.length; ++j) {
                    int difference = prices[j] - prices[i];
                    if (difference > maxPrice) {
                        maxPrice = difference;
                    }
                }
            }

            return maxPrice;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

//        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
//        System.out.println(solution.getRow(5));
//
//        long start = System.currentTimeMillis();
//        System.out.println(solution.generate(1000));
//        long end = System.currentTimeMillis();
//
//        System.out.println("End in: " + ((end - start) / 1000.0) + " ms");
    }
}
