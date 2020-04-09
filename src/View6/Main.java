package View6;

import java.util.Scanner;

/**
 * @description: 时间限制：C/C++语言 2000MS；其他语言 4000MS
 * 内存限制：C/C++语言 131072KB；其他语言 655360KB
 * 题目描述：
 * 有n位小朋友去小明家里拜年，小明准备了m份礼物。小明想把所有礼物平均分给每个小朋友，每个小朋友得到相同个数的礼物。但是m未必能被n整除，小明可以使用以下两种操作任意多次（两种操作可以同时使用）。
 *
 * 1、 给其中一个小朋友发红包，收到红包的小朋友会离开小明家。每个红包需要花费a元。
 *
 * 2、 购买一个新礼物，每个礼物价值为b元。
 *
 * 问小明最少花费多少元，才能使得所有礼物可以被剩下的小朋友平分。
 *
 * 输入
 * 第一行输入四个整数n,m,a,b（1≤n,m,a,b≤100）。
 *
 * 输出
 * 输出最少花费。
 *
 *
 * 样例输入
 * 7 5 10 100
 * 样例输出
 * 20
 *
 * 提示
 * 输入样例2
 * 2 2 10 10
 * 输出样例2
 * 0
 * 输入样例3
 * 3 1 10 10
 * 输出样例3
 * 20
 * 样例解释
 * 样例一发两个红包。样例二不需要任何操作。样例三买两个新礼物，或者发两个红包，或者发一个红包买一个新礼物。
 * @author: Seldom
 * @time: 2020/4/8 19:22
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = m-n;
        while (k>0){
            k-=n;
        }
        if (k<0){
            int tem1 = -k*b;
            int tem2 = 0;
            while (n>0){
                n--;
                tem2+=a;
                if (m%n==0){
                    break;
                }
            }
            //k=-k;
            //System.out.println(a>b?k*b:k*a);
            System.out.println(Math.min(tem1, tem2));
        }else {
            System.out.println(0);
        }

    }
}
