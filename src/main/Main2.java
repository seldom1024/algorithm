package main;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        int k2 = Integer.parseInt(k);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        int[] u = new int[s1.length];
        for (int i = 0; i < u.length; i++) {
            u[i] = Integer.parseInt(s1[i]);
        }
        int sum = 0;
        for (int i = 1; i <= u.length; i++) {
            int j = i;
            int p = 1;
            while (j <= u.length&&(u[j - 1] % p == 0)) {
                j++;
                p++;
                sum = (sum % 998244353) + 1;
            }
        }
        System.out.println(sum);
    }
}
