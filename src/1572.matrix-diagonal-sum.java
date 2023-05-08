/*
 * @lc app=leetcode id=1572 lang=java
 *
 * [1572] Matrix Diagonal Sum
 */

// @lc code=start
class Solution {
    public int diagonalSum(int[][] mat) {

        int sum = 0;
        int n = mat.length;
        
        for(int i = 0; i < n; i++){
            sum += mat[i][i] + mat[i][n-i -1];
        }
        
        if(n % 2 != 0) sum -= mat[n/2][n/2];
        
        return sum;
        
    }
}
// @lc code=end

