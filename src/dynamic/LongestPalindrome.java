package dynamic;

/**
 * @description: 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * @author: Seldom
 * @time: 2019/12/5 19:21
 */
public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        if (s.length() == 0){
            return s;
        }
        int start = 1;
        int end = 1;
        for (int i = 1; i <= s.length(); i++) {
            int length1 = expand(s, i, i);
            int length2 = expand(s, i, i + 1);
            int length = Math.max(length1, length2);
            if (length > end - start) {
                start = i - (length - 1) / 2;
                end = i + length / 2;
            }
        }
        return s.substring(start - 1, end);
    }

    private static int expand(String s, int left, int right) {
        int L = left;
        int R = right;
        while (L > 0 && R <= s.length() && s.charAt(L - 1) == s.charAt(R - 1)) {
            L--;
            R++;
        }
        return R - L + 1 - 2;
    }
}
