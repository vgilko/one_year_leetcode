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

    static class SolutionOptimal extends Solution {
        public int[] runningSum(int[] nums) {
            int[] result = new int[nums.length];

            result[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                result[i] = result[i-1] + nums[i];
            }

            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new SolutionOptimal();

        int[] test = {3,1,2,10,1};

        System.out.println(Arrays.toString(solution.runningSum(test)));
    }
}
