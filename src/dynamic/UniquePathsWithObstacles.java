package dynamic;

import java.util.Arrays;

/**
 * @description: 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * <p>
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * <p>
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-paths-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 输入:
 * [
 *   [0,0,0],
 *   [0,1,0],
 *   [0,0,0]
 * ]
 * 输出: 2
 * 解释:
 * 3x3 网格的正中间有一个障碍物。
 * 从左上角到右下角一共有 2 条不同的路径：
 * 1. 向右 -> 向右 -> 向下 -> 向下
 * 2. 向下 -> 向下 -> 向右 -> 向右
 * @author: Seldom
 * @time: 2019/12/6 18:13
 */
public class UniquePathsWithObstacles {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[] a = new int[n];
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (flag) {
                a[i] = 0;
            } else if (obstacleGrid[i][0] == 1) {
                flag = true;
                a[i] = 0;
            } else {
                a[i] = 1;
            }
        }

        for (int i = 1; i < m; i++) {
            if (obstacleGrid[0][i] == 1) {
                a[0] = 0;
            }
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[j][i] == 1) {
                    a[j] = 0;
                } else {
                    a[j] += a[j - 1];
                }
            }
        }
        return a[n - 1];
    }

    public static void main(String[] args) {
        int[][] i = new int[1][2];
        i[0][0] = 0;
        i[0][1] = 1;
        int i1 = uniquePathsWithObstacles(i);
        System.out.println(i1);
    }
}
