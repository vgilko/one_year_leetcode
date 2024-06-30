import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1 {
    static class Solution {
        public long maximumImportance(int n, int[][] roads) {
            int[] counter = new int[n];

            for (int k = 0; k < roads.length; ++k) {
                counter[roads[k][0]] += 1;
                counter[roads[k][1]] += 1;
            }

            Arrays.sort(counter);

            long result  = 0;
            for (int j = counter.length - 1; j >= 0; --j) {
                result += (long) (j + 1) * counter[j];
            }


        }
    }

    @Test
    void test() {
        int[][] roads = new int[][]{
                new int[]{0, 1},
                new int[]{1, 2},
                new int[]{2, 3},
                new int[]{0, 2},
                new int[]{1, 3},
                new int[]{2, 4}
        };
        int n = 5;

        long result = new Solution().maximumImportance(n, roads);
        assertEquals(43, result);
    }

    @Test
    void test1() {
        int[][] roads = new int[][]{
                new int[]{0, 1}
        };
        int n = 5;

        long result = new Solution().maximumImportance(n, roads);
        assertEquals(9, result);
    }

    @Test
    void test2() {
        int[][] roads = new int[][]{
                new int[]{0, 3},
                new int[]{2, 4},
                new int[]{1, 3},
        };
        int n = 5;

        long result = new Solution().maximumImportance(n, roads);
        assertEquals(20, result);
    }


    public static void main(String[] args) {

    }
}
