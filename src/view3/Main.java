package view3;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

/**
 * @description: 石头
 * 时间限制：C/C++语言 1000MS；其他语言 3000MS
 * 内存限制：C/C++语言 131072KB；其他语言 655360KB
 * 题目描述：
 * 沙滩按照线型摆放着n个大小不一的球形石头，已知第i个石头的半径为ri，且不存在两个石头有相同的半径。为了使石头的摆放更加美观，现要求摆放的石头的半径从左往右依次递增。因此，需要对一些石头进行移动，每次操作可以选择一个石头，并把它放在剩下n−1个石头在最左边或最右边。问最少需要操作多少次才能将这n个石头的半径变成升序？
 *
 * 输入
 * 第一行一个整数n，表示石头的个数。(1 <= n <= 100000) 第二行n个整数，表示从左往右石头的半径r1，r2，...，rn。(1 <= ri <= n)，且保证不存在两个不同的石头拥有相同的半径。
 *
 *
 *
 * 输出
 * 最少操作次数
 *
 *
 * 样例输入
 * 5
 * 4 1 2 5 3
 * 样例输出
 * 2
 * @author: Seldom
 * @time: 2020/3/30 11:52
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        sc.nextLine();
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        int[] num = new int[s1.length];
        for (int i = 0; i<s1.length;i++){
            num[i] = Integer.parseInt(s1[i]);
        }
        int max = 0;
        for (int o = 0; o<num.length;o++){
            int k = num[o];
            int sum = 1;
            for (int i = o+1 ; i<num.length;i++){
                if (num[i]==k+1){k++;sum++;}
                max = Math.max(sum, max);
            }
        }
        int p = num.length-max;
        System.out.println(p);
    }

}
