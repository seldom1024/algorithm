package view4;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: 被砍掉的树
 * 时间限制：C/C++语言 1000MS；其他语言 3000MS
 * 内存限制：C/C++语言 131072KB；其他语言 655360KB
 * 题目描述：
 * 某条街道两侧分别种植了一排树木，并按如下编号：
 *
 * 1 3 5 7 .... 45 47 49 ... 99
 *
 * 2 4 6 8 ... 46 48 50 ... 100
 *
 * 但是有一些树被砍去，希望你能找出一边最长的连续的大树。
 *
 * 输入
 * 第一行一个整数N
 *
 * 第二行N个整数表示被砍去树的编号
 *
 * 输出
 * M 和 X（表示从第M棵大树开始，共有连续的X棵大树，如果有多个解，输出M最小的解即可）
 *
 *
 * 样例输入
 * 5
 * 9 15 27 35 6
 * 样例输出
 * 8 47
 * @author: Seldom
 * @time: 2020/3/30 12:30
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        ArrayList<Integer> rlist = new ArrayList<>();
        rlist.add(-1);
        ArrayList<Integer> llist = new ArrayList<>();
        rlist.add(0);
        int[] num = new int[s1.length];
        for (int i = 0; i<s1.length;i++){
            num[i] = Integer.parseInt(s1[i]);
        }
        Arrays.sort(num);
        for (int k : num){
            if (k%2==0){
                llist.add(k);
            }else {
                rlist.add(k);
            }
        }
        llist.add(102);
        rlist.add(101);
        int lmax = 0;
        int lindex = 0;
        for (int h = 1; h<llist.size();h++) {
            int g = llist.get(h)-llist.get(h-1);
            if (g>lmax){
                lmax=g;
                lindex = llist.get(h-1)+2;
            }
        }
        int rmax = 0;
        int rindex = 0;
        for (int h = 1; h<rlist.size();h++) {
            int g = rlist.get(h)-rlist.get(h-1);
            if (g>rmax){
                rmax=g;
                rindex = rlist.get(h-1)+2;
            }
        }
        if (rmax>lmax){
            System.out.print(rindex+" ");
            System.out.println((rmax/2)-1);
        }else {
            System.out.print(lindex+" ");
            System.out.println((lmax/2)-1);
        }
    }
}
