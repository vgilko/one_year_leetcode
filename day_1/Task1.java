import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    static class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();

            if (numRows == 1) {
                return List.of(List.of(1));
            }

            Integer[] prevRow = null;
            Integer[] currentRow = null;

            for (int i = 0; i < numRows; ++i) {
                currentRow = new Integer[i + 1];
                currentRow[0] = 1;
                currentRow[i] = 1;

                for (int j = 1; j < i; ++j) {
                    currentRow[j] = prevRow[j - 1] + prevRow[j];
                }

                prevRow = currentRow;

                result.add(Arrays.asList(currentRow));
            }

            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.generate(3));
        System.out.println(solution.generate(5));
//
//        long start = System.currentTimeMillis();
//        System.out.println(solution.generate(1000));
//        long end = System.currentTimeMillis();
//
//        System.out.println("End in: " + ((end - start) / 1000.0) + " ms");
    }
}
