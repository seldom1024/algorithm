package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        int k2 = Integer.parseInt(k);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        int[] u = new int[s1.length];
        for (int i =0;i<u.length;i++){
            u[i] = Integer.parseInt(s1[i]);
        }
        System.out.println(def(1, u));
    }

    public static int def(int length, int[] su){
        int index = 0;
        boolean f =true;
        int sum = 0;
        for (; index+length<=su.length;index++){
            for (int i =index;i<index+length; i++){
                if (su[i]%(i+1-index)!=0){
                    f= false;
                    break;
                }
            }
            if (f){
                sum = (sum%998244353)+1;
            }else {
                f = true;
            }
        }
        int def= 0;
        if (length<=su.length){
            def = def(length + 1, su)%998244353;
        }
        return (sum+def)%998244353;
    }
}
