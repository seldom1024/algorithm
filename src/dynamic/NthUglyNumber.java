package dynamic;

import java.time.OffsetDateTime;
import java.util.PriorityQueue;

/**
 * @description: 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 * <p>
 * 示例 1:
 * <p>
 * 输入: n = 12
 * 输出: 3
 * 解释: 12 = 4 + 4 + 4.
 * 示例 2:
 * <p>
 * 输入: n = 13
 * 输出: 2
 * 解释: 13 = 4 + 9.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/perfect-squares
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: Seldom
 * @time: 2019/12/14 9:11
 */
public class NthUglyNumber {


    /**
     * 丑数求解过程：首先除2，直到不能整除为止，然后除5到不能整除为止，然后除3直到不能整除为止。
     * 最终判断剩余的数字是否为1，如果是1则为丑数，否则不是丑数
     * <p>
     * 解题思路：
     * 从1开始遍历，按丑数求解过程找出满足条件的第n个丑数（提交超时）
     * 思路优化（如何利用之前的计算）
     * 解题二：动态规划+三指针
     * dp保存按序排列的丑数，三指针分别是*2，*3，*5，找出下一个丑数
     *
     * @param n
     * @return
     */
    public static int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < n; i++) {
            int min = Math.min(dp[i2] * 2, Math.min(dp[i3] * 3, dp[i5] * 5));
            if (min == dp[i2] * 2) {
                i2++;
            }
            if (min == dp[i3] * 3) {
                i3++;
            }
            if (min == dp[i5] * 5) {
                i5++;
            }
            dp[i] = min;
        }
        return dp[n - 1];
    }

    public static int nthUglyNumber2(int n) {
        if (n == 0) {
            return 0;
        }
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();
        int[] res = {2, 3, 5};
        long tem = 1;
        int count = 1;
        for (; count < n; count++) {
            for (int re : res) {
                if (!priorityQueue.contains(tem * re)) {
                    priorityQueue.add(tem * re);
                }
            }
            tem = priorityQueue.remove();
        }
        return (int) tem;
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(100));
    }
}
