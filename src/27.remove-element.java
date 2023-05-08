/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {

        int c = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[c++] = nums[i];
            }
        }

        return c;

        // int count = 0;

        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] == val) {
        // count++;
        // } else {
        // nums[i - count] = nums[i];

        // }
        // }

        // return nums.length - count;

    }
}
// @lc code=end
