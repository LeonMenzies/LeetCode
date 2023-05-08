import java.util.Map;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {

    private Map<Character, Character> dict = Map.of(
            '(', ')',
            '[', ']',
            '{', '}');

    public boolean isValid(String s) {

        if (s.length() == 1) {
            return false;
        }

        if (dict.get(s.charAt(0)) != s.charAt(1)) {
            isValid(s.substring(1));
        }
        return true;

    }
}
// @lc code=end
