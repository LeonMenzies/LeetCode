/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {

        int index = 1;
        int current = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != current) {
                nums[index] = nums[i];
                current = nums[i];
                index++;
            }
        }

        return index;
    }
}
// @lc code=end
