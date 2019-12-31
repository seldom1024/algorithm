/**
 * @description: 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1
 * 输出: true
 * 解释: 20 = 1
 * 示例 2:
 * <p>
 * 输入: 16
 * 输出: true
 * 解释: 24 = 16
 * 示例 3:
 * <p>
 * 输入: 218
 * 输出: false
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/power-of-two
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * 解题思路：
 * 若 n = 2^xn=2
 * x
 *   且 xx 为自然数（即 nn 为 22 的幂），则一定满足以下条件：
 * 恒有 n & (n - 1) == 0，这是因为：
 * nn 二进制最高位为 11，其余所有位为 00；
 * n - 1n−1 二进制最高位为 00，其余所有位为 11；
 * 一定满足 n > 0。
 * 因此，通过 n > 0 且 n & (n - 1) == 0 即可判定是否满足 n = 2^xn=2
 * x
 *  。
 *
 * 作者：jyd
 * 链接：https://leetcode-cn.com/problems/power-of-two/solution/power-of-two-er-jin-zhi-ji-jian-by-jyd/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @author: Seldom
 * @time: 2019/12/27 23:29
 */
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
