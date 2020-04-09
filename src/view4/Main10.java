package view4;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @description: 有 N 堆金币排成一排，第 i 堆中有 C[i] 块金币。每次合并都会将相邻的两堆金币合并为一堆，成本为这两堆金币块数之和。经过N-1次合并，最终将所有金币合并为一堆。请找出将金币合并为一堆的最低成本。
 *
 * 其中，1 <= N <= 30，1 <= C[i] <= 100
 *
 *
 * 输入描述:
 * 第一行输入一个数字 N 表示有 N 堆金币
 * 第二行输入 N 个数字表示每堆金币的数量 C[i]
 *
 * 输出描述:
 * 输出一个数字 S 表示最小的合并成一堆的成本
 *
 * 输入例子1:
 * 4
 * 3 2 4 1
 *
 * 输出例子1:
 * 20
 *
 * 输入例子2:
 * 30
 * 10 20 30 40 50 60 70 80 90 100 99 89 79 69 59 49 39 29 19 9 2 12 22 32 42 52 62 72 82 92
 *
 * 输出例子2:
 * 7307
 * @author: Seldom
 * @time: 2020/4/4 22:14
 */
public class Main10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        sc.nextLine();
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s2 : s1) {
            list.add(Integer.parseInt(s2));
        }
        int count = 0;
        while (list.size()>1){
            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i<list.size()-1;i++){
                int tem = list.get(i)+list.get(i+1);
                if (tem<min){
                    min = tem;
                    index = i;
                }
            }
            list.set(index, list.get(index)+list.get(index+1));
            list.remove(index+1);
            count+=min;
        }
        System.out.println(count);
    }
}
