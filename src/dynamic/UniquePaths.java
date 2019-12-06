package dynamic;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @description: 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * <p>
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * <p>
 * 问总共有多少条不同的路径？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-paths
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: Seldom
 * @time: 2019/12/6 17:50
 */
public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        if (m > n) {
            int tem = m;
            m = n;
            n = tem;
        }
        int[] a = new int[m];
        Arrays.fill(a, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                a[j] += a[j - 1];
            }
        }
        return a[m - 1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(2, 3));
    }
}
