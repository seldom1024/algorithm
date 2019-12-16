package dynamic;

/**
 * @description: 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 * <p>
 * 你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
 * <p>
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 * <p>
 * 示例 1:
 * s = "abc", t = "ahbgdc"
 * <p>
 * 返回 true.
 * <p>
 * 示例 2:
 * s = "axc", t = "ahbgdc"
 * <p>
 * 返回 false.
 * <p>
 * 后续挑战 :
 * <p>
 * 如果有大量输入的 S，称作S1, S2, ... , Sk 其中 k >= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？
 * <p>
 * <p>
 * 题解二. 后续挑战，输入量大，小写字母创建25的二维数组，存储t的坐标，这样就可以把s的判断直接转为坐标的判断，
 * dp[0]代表了存储了a出现在t的所有的位置,逐个字符判断s的字符顺序是否在t内，直接返回结果。
 * 时间复杂度O(t.size()+2000)：分别为创建数组需要O(t.size()),
 * 索引是递增的使用二分查找s的单个字符20次之内就可找到需要O(100*20)。
 * 适用大量的输入判断子序列。
 * <p>
 * 作者：zzzzzz-5
 * 链接：https://leetcode-cn.com/problems/is-subsequence/solution/cpan-duan-zi-xu-lie-hou-xu-tiao-zhan-by-zzzzzz-5/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/is-subsequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: Seldom
 * @time: 2019/12/16 9:18
 */
public class IsSubsequence {
    public boolean isSubsequence2(String s, String t) {
        int t_index = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = t_index; j <= t.length(); j++) {
                if (j == t.length()) {
                    return false;
                }
                if (s.charAt(i) == t.charAt(j)) {
                    t_index = j + 1;
                    break;
                }
            }
        }
        return true;
    }

    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int a = 0;
        int len = s.length();
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(a) == t.charAt(i)) {
                a++;
            }
            if (a == len) {
                return true;
            }
        }
        return false;
    }
}
