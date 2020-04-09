package interview;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @description: 给定一个正整数数组，它的第 i 个元素是比特币第 i 天的价格。
 *
 * 如果你最多只允许完成一笔交易（即买入和卖出一次），设计一个算法来计算你所能获取的最大利润。
 *
 * 注意你不能在买入比特币前卖出。
 *
 *
 * 输入描述:
 * 正整数数组，为以空格分隔的n个正整数
 *
 * 输出描述:
 * 最大利润
 *
 * 输入例子1:
 * 7 1 5 3 6 4
 *
 * 输出例子1:
 * 5
 * @author: Seldom
 * @time: 2020/3/25 14:45
 */
public class n2 {
    public static void main(String[] args) {
        int maxP = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        int index = 0;
        while (index < s1.length){
            int i = Integer.parseInt(s1[index]);
            if (i<min){
                min = i;
                max = i;
            }
            if (i>max){
                max = i;
                maxP = Math.max(maxP, max-min);
            }
            index++;
        }
        System.out.println(maxP);
    }
}
