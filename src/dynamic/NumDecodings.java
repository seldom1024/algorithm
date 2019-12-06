package dynamic;

import org.omg.CORBA.ARG_OUT;

/**
 * @description: 一条包含字母 A-Z 的消息通过以下方式进行了编码：
 * <p>
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * 给定一个只包含数字的非空字符串，请计算解码方法的总数。
 * @author: Seldom
 * @time: 2019/12/6 11:45
 */
public class NumDecodings {
    public static int numDecodings(String s) {
        if (s.isEmpty() || s.charAt(0) == '0') {
            return 0;
        }
        int b1 = 1, b2 = 1;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == '0') {
                b1 = 0;
            }
            if (s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) <= '6')) {
                b1 = b1 + b2;
                b2 = b1 - b2;
            } else {
                b2 = b1;
                if (b1 == 0 && b2 == 0) {
                    return 0;
                }
            }
        }
        return b1;
    }
}
