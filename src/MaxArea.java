/**
 * @description: 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 * <p>
 * <p>
 * <p>
 * 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 输入: [1,8,6,2,5,4,8,3,7]
 * 输出: 49
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: Seldom
 * @time: 2020/1/19 20:00
 */
public class MaxArea {
    //public static int maxArea(int[] height) {
    //    if (height.length == 0 || height.length == 1) {
    //        return 0;
    //    }
    //    int i = 0;
    //    int j = height.length - 1;
    //    int max = Math.min(height[i], height[j]) * (height.length - 1);
    //    while (i < j - 1) {
    //        if (height[i] < height[j]) {
    //            i = lookRight(i, j, height);
    //            System.out.println("i====" + i);
    //            if (i == -1) {
    //                return max;
    //            }
    //        } else {
    //            j = lookLeft(i, j, height);
    //            if (j == -1) {
    //                return max;
    //            }
    //        }
    //        int tem = (j - i) * (Math.min(height[i], height[j]));
    //        max = Math.max(tem, max);
    //    }
    //    return max;
    //}
    //
    //public static int lookRight(int i, int j, int[] height) {
    //    int tem = height[i];
    //    while (height[i] <= tem) {
    //        i++;
    //        if (i == j) {
    //            return -1;
    //        }
    //    }
    //    return i;
    //}
    //
    //public static int lookLeft(int i, int j, int[] height) {
    //    int tem = height[j];
    //    while (height[j] <= tem) {
    //        j--;
    //        if (i == j) {
    //            return -1;
    //        }
    //    }
    //    return j;
    //}

    public static void main(String[] args) {
        int i = maxArea(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(i);
    }

    /**
     * 官方题解
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxarea;
    }
}
