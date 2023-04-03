import java.util.Map;

/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {

        int toReturn = 0, num = 0, prev = 0;

        Map<Character, Integer> dict = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        for (int j = s.length() - 1; j >= 0; j--) {
            num = dict.get(s.charAt(j));
            if (num < prev) {
                toReturn -= num;
            } else {
                toReturn += num;
            }
            prev = num;
        }
        return toReturn;
    }
}
// @lc code=end
