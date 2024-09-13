import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task1 {
    static
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> values = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c == '[' || c == '{' || c == '(') {
                    values.push(c);
                } else {
                    if (values.isEmpty()) {
                        return false;
                    }
                    if ((c == ']' || c == '}')) {
                        if ((c - values.peek()) != 2) {
                            return false;
                        }
                    } else {
                        if ((c - values.peek()) != 1) {
                            return false;
                        } 
                    }
                    values.pop();
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
