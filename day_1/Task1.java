import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Task1 {
    static class Solution {
        public List<String> commonChars(String[] words) {
            ArrayList<String> result = new ArrayList<>();
            int[] minFreq = new int[26];

            Arrays.fill(minFreq, Integer.MAX_VALUE);

            for (String word : words) {
                int[] freq = new int[26];

                for (char c : word.toCharArray()) {
                    freq[c - 'a']++;
                }


                for (int i = 0; i < minFreq.length; ++i) {
                    minFreq[i] = Math.min(minFreq[i], freq[i]);
                }
            }

            for (int i = 0; i < minFreq.length; ++i) {
                while (minFreq[i] > 0) {
                    --minFreq[i];
                    result.add(String.valueOf((char) (i + 'a')));
                }
            }

            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.commonChars(new String[]{"bella", "label", "roller"}));
        System.out.println(solution.commonChars(new String[]{"cool", "lock", "cook"}));
    }
}
