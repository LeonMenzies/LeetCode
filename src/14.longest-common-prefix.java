import java.util.Arrays;

/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        int i;

        for (i = 0; i < strs[0].length(); i++) {
            if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i)) {
                break;
            }
        }
        
        return strs[0].substring(0, i);
    }
}
// @lc code=end
