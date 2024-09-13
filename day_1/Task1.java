import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task1 {
    static
    class Solution {
        public boolean isPalindrome(String s) {
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                    stringBuilder.append(c);
                }
            }

            String lowerCase = stringBuilder.toString().toLowerCase();

            for (int i = 0, k = lowerCase.length() - 1; i <= k; ++i, --k) {
                if (lowerCase.charAt(i) != lowerCase.charAt(k)) {
                    return false;
                }
            }
            
            return true;
        }
    }

    @Test
    void test() {
        boolean palindrome = new Solution().isPalindrome("A man, a plan, a canal: Panama");
        assertTrue(palindrome);
    }

    public static void main(String[] args) {

    }
}
