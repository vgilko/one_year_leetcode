import java.util.Arrays;

public class Task1 {
    static class Solution {
        public int[] runningSum(int[] nums) {
            int[] result = new int[nums.length];

            for (int idx = 0; idx < nums.length; idx++) {
                int j = 0;
                do {
                    result[idx] += nums[j];

                } while (j++ < idx);
            }

            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] test = {3,1,2,10,1};

        System.out.println(Arrays.toString(solution.runningSum(test)));
    }
}
