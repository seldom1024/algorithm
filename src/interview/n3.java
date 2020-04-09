package interview;

import java.util.Scanner;

/**
 * @description: 小招喵喜欢吃喵粮。这里有 N 堆喵粮，第 i 堆中有 p[i] 粒喵粮。喵主人离开了，将在 H 小时后回来。
 *
 * 小招喵可以决定她吃喵粮的速度 K （单位：粒/小时）。每个小时，她将会选择一堆喵粮，从中吃掉 K 粒。如果这堆喵粮少于 K 粒，她将吃掉这堆的所有喵粮，然后这一小时内不会再吃更多的喵粮。
 *
 * 小招喵喜欢慢慢吃，但仍然想在喵主人回来前吃掉所有的喵粮。
 *
 * 返回她可以在 H 小时内吃掉所有喵粮的最小速度 K（K 为整数）。
 *
 *
 * 输入描述:
 * 第一行输入为喵粮数组，以空格分隔的N个整数
 *
 * 第二行输入为H小时数
 *
 * 输出描述:
 * 最小速度K
 *
 * 输入例子1:
 * 3 6 7 11
 * 8
 *
 * 输出例子1:
 * 4
 * @author: Seldom
 * @time: 2020/3/25 15:14
 */
public class n3 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        int h = sc.nextInt();
        String[] s1 = s.split(" ");
        int[] s2 = new int[s1.length];
        for (int i = 0; i<s1.length; i++) {
            s2[i] = Integer.parseInt(s1[i]);
        }
        int index= 0;
        int eat = 1;
        int t = 0;
        while (index<s1.length){
            int tem = s2[index++];
            while (true){
                tem-=eat;
                t++;
                if (tem<=0){
                    break;
                }
            }
            if (t>h){
                break;
            }
        }
    }
}
