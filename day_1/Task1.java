import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    static
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int v1;
            Map<Integer, Integer> values = new HashMap<>();

            for (int k = 0; k < nums.length; ++k) {
                v1 = nums[k];
                int difference = target - v1;
                Integer i = values.get(difference);
                if (i != null) {
                    return new int[]{i, k};
                }

                values.put(v1, k);
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
