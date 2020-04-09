package view4;

import java.util.Scanner;

/**
 * @description: 题目：输入一个正整数n，请找出最小的正整数m（m>9，也就是至少是两位数），使得m的各个位（个位、十位、百位。。。）乘积之和等于n，不存在输出-1。
 * 例如：n = 36时，输出49； n=100时，输出455；
 *
 * @author: Seldom
 * @time: 2020/4/4 10:44
 */
public class Num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int check = jus(n);
        System.out.println(check);
    }

    /**
     *
     *      分析：首先需要判断对于任意一个n，是否存在相应的m，判断依据是对于十进制而言，每一位在0-9之间，若该数存在10以上的质因子，则一定不存在相应的m。
     * 逆向思维：不存在10以上的质因子，也就是所有的质因子都在10以内，10以内的质数包括2,、3、5、7四个数，问题转化为若该数仅存在这四个质因数，即存在
     * 对应的m；
     * @param n
     * @return
     */
    public static boolean check(int n){
        int[] k = new int[]{2,3,5,7};
        for (int i : k) {
            while (n%i==0){
                n/=i;
            }
        }
        return n==1;
    }

    /**
     * 判断完了以后，需要找出这个m，最简单的办法也就是最笨的办法，可以从1开始遍历每一个数，若满足各位乘积等于n则满足条件。
     * 改善方法：问题可以转为使用x个2，y个3，z个5，t个7进行拼凑出最小的m
     * 例如：n=100=2*2*5*5，拼凑出455，直观的想法就是尽可能的使得位数最少，并且把大数放在低位，要使得位数尽可能的少，则尽可能使得3个2结合形成8，两
     * 个3结合形成9，要使得结合的数尽可能小，可以除8和9以外的2和3结合形成6，其次是4和3，则优先情况应该是8,9,6,3,2，将不可以组合的5,7包含在内就是
     * 8,9,6,3,2,5,7，由于8和9互不影响，则按照大小可以排列为9,8,7,6,5,4,3,2
     * @param n
     * @return
     */
    public static int jus(int n){
        if (!check(n)) return -1;
        int[] k = new int[]{9,8,7,6,5,4,3,2};
        int sum = 0;
        int base = 1;
        for (int i : k) {
            while (n%i==0){
                n/=i;
                sum+=i*base;
                base*=10;
            }
        }
        return sum;
    }
}
