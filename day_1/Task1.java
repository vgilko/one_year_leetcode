public class Task1 {
    static class Solution {

        public int climbStairs(int n) {
            if (n <= 2) {
                return n;
            }

            int current = 1;
            int prev = 1;

            for (int i = 3; i < n + 1; ++i) {
                current += prev;
                prev = current - prev;
            }

            return current + prev;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.climbStairs(1));
        System.out.println(solution.climbStairs(2));
        System.out.println("\n" + solution.climbStairs(3));
        System.out.println("\n" + solution.climbStairs(44));
    }
}
