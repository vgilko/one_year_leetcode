import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task1 {
    static
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> values = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c == '[' || c == '{') {
                    values.push((char) (c + 2));
                } else if (c == '(') {
                    values.push(')');
                } else {
                    char c1 = values.isEmpty() ? '@' : values.pop();

                    if (c1 != c) {
                        return false;
                    }
                }
            }

            return values.isEmpty();
        }
    }

    @Test
    void test() {
        assertTrue(new Solution().isValid("()"));
    }

    public static void main(String[] args) {

    }
}
