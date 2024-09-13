import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Task1 {
    static
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int v1;
            for (int k = 0; k < nums.length; ++k) {
                v1 = nums[k];
                for (int m = k + 1; m < nums.length; ++m) {
                    if (v1 + nums[m] == target) {
                        return new int[]{k, m};
                    }
                }
            }
            return null;
        }
    }

    @Test
    void test() {
        int[] ints = {2, 123, 7, 11, 15};
        int[] ints1 = new Solution().twoSum(ints, 9);
        System.out.println(Arrays.toString(ints1));
    }

    public static void main(String[] args) {

    }
}
