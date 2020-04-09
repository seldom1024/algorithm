package view4;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: Seldom
 * @time: 2020/4/5 12:42
 */
public class Main13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        String t = scanner.nextLine();
        if (Pattern.matches(p.replace("*",".*").replace("?","."),t)){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
