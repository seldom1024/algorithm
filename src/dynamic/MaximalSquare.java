package dynamic;

/**
 * @description: 在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * <p>
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 * <p>
 * 输出: 4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximal-square
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: Seldom
 * @time: 2019/12/13 16:29
 */
public class MaximalSquare {
    public static int maximalSquare(char[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int max = 0;
        int d = 0;
        int[] dp = new int[matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++) {
            dp[j] = Integer.parseInt(String.valueOf(matrix[0][j]));
            if (dp[j] == 1) {
                max = 1;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            d = dp[0];
            if (d > max) {
                max = d;
            }
            dp[0] = Integer.parseInt(String.valueOf(matrix[i][0]));
            for (int j = 1; j < matrix[0].length; j++) {
                int tem = dp[j];
                if (matrix[i][j] == '1') {
                    dp[j] = Math.min(Math.min(dp[j - 1], dp[j]), d) + 1;
                    if (dp[j] > max) {
                        max = dp[j];
                    }
                }else {
                    dp[j] = 0;
                }
                d = tem;
                System.out.println(max);
            }
        }
        return max * max;
    }

    public static void main(String[] args) {

    }
}
