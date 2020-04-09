package view4;

import javax.swing.*;
import java.util.*;
public class Main9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int count = 0;
        for (int i = 0; i<n.length();i++){
            for (int j = i ;j<n.length();j++){
                boolean check = check(n, i, j);
                if (check){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean check(String s, int begin, int last){
        if (begin==last)return true;
        while (begin<=last){
            if (s.charAt(begin)==s.charAt(last)){
                last--;
                begin++;
            }else {
                return false;
            }
        }
        return true;
    }
}