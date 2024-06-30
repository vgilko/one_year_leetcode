import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1 {
    static class Solution {
        public long maximumImportance(int n, int[][] roads) {
            List<Map.Entry<Integer, Long>> collect = Stream.of(roads)
                    .flatMapToInt(IntStream::of)
                    .boxed()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .collect(Collectors.toList());

            long result = 0;
            for (int i = collect.size() - 1; i >= 0; --i) {
                result += collect.get(i).getValue() * n;
                --n;
            }

            return result;
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


    public static void main(String[] args) {

    }
}
