package view2;

import java.util.Scanner;

/**
 * @description:
 * @author: Seldom
 * @time: 2020/3/28 18:52
 */
public class Main {
    static int[] p =   new int[]{2, 2, 3, 1, 5, 2};
    static int[] num = new int[]{2, 3, 1, 5, 4, 3};
    static boolean[] have = new boolean[]{false, false, false, false, false, false};
    static int max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        int h = Integer.parseInt(k);
        buy(h, 0);
        System.out.println(max);
    }

    static void buy(int money, int tem) {
        for (int i = 0; i < 6; i++) {
            if (have[i]) continue;
            have[i] = true;
            if (!(money-p[i]<0)){
                buy(money-p[i], tem+num[i]);
            }else {
                max=Math.max(max, tem);
            }
            have[i] = false;
        }
    }
}
