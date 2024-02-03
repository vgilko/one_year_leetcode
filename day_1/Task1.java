import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Task1 {
    static class Solution {

        @EqualsAndHashCode
        static class Pair {
            int first;
            int second;

            public Pair(int first, int second) {
                this.first = first;
                this.second = second;
            }
        }

        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();

            if (numRows == 1) {
                return List.of(List.of(1));
            } else if (numRows == 2) {
                return List.of(
                        List.of(1),
                        List.of(1, 1));
            }

            HashMap<Pair, Integer> memo = new HashMap<>();

            for (int rowIndex = 0; rowIndex < numRows; ++rowIndex) {
                Integer[] integers = new Integer[rowIndex + 1];

                integers[0] = 1;
                integers[rowIndex] = 1;

                for (int columnIndex = 1; columnIndex < rowIndex; ++columnIndex) {
                    int secondIndex = columnIndex > rowIndex / 2
                            ? rowIndex - columnIndex
                            : columnIndex;
                    Pair pair = new Pair(rowIndex - 1, secondIndex);

                    Integer sum = memo.get(pair);
                    if (sum == null) {
                        List<Integer> prevRow = result.get(rowIndex - 1);
                        sum = prevRow.get(columnIndex - 1) + prevRow.get(columnIndex);
                        memo.put(pair, sum);
                    }

                    integers[columnIndex] = sum;
                }

                result.add(Arrays.asList(integers));
            }

            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.generate(3));
        System.out.println(solution.generate(5));
        System.out.println(solution.generate(30));
    }
}
