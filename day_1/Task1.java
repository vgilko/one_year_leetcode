import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
            }

            List<Integer> prevRow = null;
            List<Integer> currentRow;

            for (int i = 0; i < numRows; ++i) {
                currentRow = Stream.generate(() -> 1)
                        .limit(i + 1)
                        .collect(Collectors.toList());

                for (int j = 1; j < i; ++j) {
                    currentRow.set(j, prevRow.get(j - 1) + prevRow.get(j));
                }

                prevRow = currentRow;

                result.add(currentRow);
            }

            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.generate(3));
        System.out.println(solution.generate(5));

        long start = System.currentTimeMillis();
        System.out.println(solution.generate(1000));
        long end = System.currentTimeMillis();

        System.out.println("End in: " + ((end - start) / 1000.0) + " ms");
    }
}
