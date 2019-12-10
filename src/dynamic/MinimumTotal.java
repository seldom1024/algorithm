package dynamic;

import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor;

import java.util.List;

/**
 * @description: 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 * <p>
 * 例如，给定三角形：
 * <p>
 * [
 * [2],
 * [3,4],
 * [6,5,7],
 * [4,1,8,3]
 * ]
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 * <p>
 * 说明：
 * <p>
 * 如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: Seldom
 * @time: 2019/12/8 11:23
 */
public class MinimumTotal {
    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.isEmpty()) {
            return 0;
        }
        if (triangle.size() == 1) {
            return triangle.get(0).get(0);
        }
        int le = triangle.size();
        int[] a = new int[le];
        a[0] = triangle.get(0).get(0);
        for (int i = 1; i < le; i++) {
            a[i] = a[i - 1] + triangle.get(i).get(i);
            for (int j = i - 1; j > 0; j--) {
                a[j] = Math.min(a[j], a[j - 1]) + triangle.get(i).get(j);
            }
            a[0] = a[0] + triangle.get(i).get(0);
        }
        return min(a);
    }

    public static int min(int[] a) {
        for (int i = 1; i < a.length; i++) {
            a[i] = Math.min(a[i - 1], a[i]);
        }
        return a[a.length - 1];
    }
}
