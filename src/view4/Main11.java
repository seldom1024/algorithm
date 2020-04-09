package view4;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @description:
 * @author: Seldom
 * @time: 2020/4/4 22:45
 */
public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String[] s = new String[k];
        for (int i = 0; i<k;i++){
            s[i] = sc.nextLine();
        }
        for (String s1 : s) {
            System.out.println(s1);
        }
        Arrays.sort(s);
        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}
