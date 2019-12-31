package dynamic;

import java.util.Stack;

/**
 * @description: 题解 https://leetcode-cn.com/problems/largest-rectangle-in-histogram/solution/zhu-zhuang-tu-zhong-zui-da-de-ju-xing-by-leetcode/
 * @author: Seldom
 * @time: 2019/12/20 18:27
 */
public class LargestRectangleArea {
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxarea = 0;
        for (int i = 0; i < heights.length; ++i) {
            while (stack.peek() != -1 && heights[stack.peek()] >= heights[i]) {
                maxarea = Math.max(maxarea, heights[stack.pop()] * (i - stack.peek() - 1));
            }
            stack.push(i);
        }
        while (stack.peek() != -1) {
            maxarea = Math.max(maxarea, heights[stack.pop()] * (heights.length - stack.peek() - 1));
        }
        return maxarea;
    }

    public int largestRectangleArea2(int[] heights) {
        int res = 0;
        int len, wid;
        for (int i = 0; i < heights.length; i++) {
            if (i != heights.length - 1 && heights[i] <= heights[i + 1]) {
                continue;   //这一步的判断很玄妙
            }
            wid = heights[i];
            for (int j = i; j >= 0; j--) {
                len = i - j + 1;
                wid = Math.min(wid, heights[j]);
                res = Math.max(res, len * wid);
            }
        }
        return res;
    }
}
