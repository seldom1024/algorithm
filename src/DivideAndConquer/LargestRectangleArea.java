package DivideAndConquer;

/**
 * @description: 给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。
 * <p>
 * 求在该柱状图中，能够勾勒出来的矩形的最大面积。给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。
 * <p>
 * 求在该柱状图中，能够勾勒出来的矩形的最大面积。
 * @author: Seldom
 * @time: 2019/12/20 16:29
 */
public class LargestRectangleArea {
    public static int largestRectangleArea(int[] heights) {
        return maxArea(0, heights.length - 1, heights);
    }

    public static int maxArea(int start, int end, int[] heights) {
        if (start > end) {
            return 0;
        }
        int min = heights[start];
        int flag = start;
        for (int i = start; i <= end; i++) {
            if (heights[i] < min) {
                min = heights[i];
                flag = i;
            }
        }
        return Math.max(min * (end - start + 1), Math.max(maxArea(start, flag - 1, heights), maxArea(flag + 1, end, heights)));
    }

    public static void main(String[] args) {
        int i = largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3});
        System.out.println(i);
    }
}
