import java.util.Arrays;
import java.util.List;

public class Task1 {
    static class Solution {
        public List<Integer> getRow(int rowIndex) {
            Integer[] row = new Integer[rowIndex + 1];

            Arrays.fill(row, 0);
            row[0] = 1;

            for (int i = 1; i < rowIndex + 1; ++i) {
                for (int j = i; j >= 1; --j) {
                    row[j] += row[j - 1];
                }
            }

            return Arrays.asList(row);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.getRow(3));
        System.out.println(solution.getRow(5));
//
//        long start = System.currentTimeMillis();
//        System.out.println(solution.generate(1000));
//        long end = System.currentTimeMillis();
//
//        System.out.println("End in: " + ((end - start) / 1000.0) + " ms");
    }
}
