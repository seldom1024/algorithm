package dynamic;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @description: 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * <p>
 * 说明：每次只能向下或者向右移动一步。
 * @author: Seldom
 * @time: 2019/12/7 9:56
 */
public class MinPathSum {
    public int minPathSum(int[][] grid) {
        for (int k = 1; k < grid[0].length; k++) {
            grid[0][k] += grid[0][k - 1];
        }
        for (int i = 1; i < grid.length; i++) {
            grid[i][0] += grid[i - 1][0];
            for (int j = 1; j < grid[0].length; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}
