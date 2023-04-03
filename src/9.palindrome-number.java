/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        

        if (x < 0) {
            return false;
        }

        int y = 0;
        int z = x;
        while (z != 0) {
            y = y * 10 + z % 10;
            z /= 10;
        }

        return x == y;

    }
}
// @lc code=end

