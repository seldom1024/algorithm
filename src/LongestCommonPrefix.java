/**
 * @description:
 * @author: Seldom
 * @time: 2020/1/19 21:43
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int i = Integer.MAX_VALUE;
        for (String j : strs) {
            i = Math.min(i, j.length());
        }
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while (j < i) {
            int k = 1;
            while (k < strs.length) {
                if (strs[k - 1].charAt(j) != strs[k].charAt(j)) {
                    return sb.toString();
                }
                k++;
            }
            sb.append(strs[0].charAt(j));
            j++;
        }
        return sb.toString();
    }
}
