package dynamic;

import java.util.LinkedList;
import java.util.List;

/**
 * @description: 5124. 顺次数 显示英文描述
 * 用户通过次数179
 * 用户尝试次数219
 * 通过次数179
 * 提交次数273
 * 题目难度Medium
 * 我们定义「顺次数」为：每一位上的数字都比前一位上的数字大 1 的整数。
 * <p>
 * 请你返回由 [low, high] 范围内所有顺次数组成的 有序 列表（从小到大排序）。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输出：low = 100, high = 300
 * 输出：[123,234]
 * 示例 2：
 * <p>
 * 输出：low = 1000, high = 13000
 * 输出：[1234,2345,3456,4567,5678,6789,12345]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 10 <= low <= high <= 10^9
 * @author: Seldom
 * @time: 2019/12/15 10:47
 */
public class SequentialDigits {
    public static List<Integer> sequentialDigits(int low, int high) {
        if (low >= high) {
            return new LinkedList<>();
        }
        String s = Integer.toString(low);
        List<Integer> list = new LinkedList<>();
        int index = 1;
        int add = 1;
        int length = s.length();
        for (int i = 2; i <= s.length(); i++) {
            index = index * 10 + i;
            add = add * 10 + 1;
        }
        int tem = index;
        while (true) {
            if (tem % 10 == 0) {
                index = index * 10 + Integer.toString(index).length() + 1;
                add = add * 10 + 1;
                tem = index;
            }
            if (tem < low) {
                tem += add;
            } else {
                if (tem>high){
                    return list;
                }
                list.add(tem);
                break;
            }
        }
        tem = tem + add;
        while (true) {
            if (tem > high) {
                break;
            }
            if (tem % 10 != 0) {
                list.add(tem);
                tem += add;
            }
            if (tem % 10 == 0) {
                index = index * 10 + Integer.toString(index).length() + 1;
                add = add * 10 + 1;
                tem = index;
            }
        }
        return list;
    }



    public static void main(String[] args) {
        List<Integer> list = sequentialDigits(234, 2314);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
