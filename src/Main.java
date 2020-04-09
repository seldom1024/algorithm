import java.awt.*;
import java.text.DecimalFormat;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @description: 数字置换
 * 时间限制：C/C++语言 1000MS；其他语言 3000MS
 * 内存限制：C/C++语言 65536KB；其他语言 589824KB
 * 题目描述：
 * 首先给出你一个整数，可能为正也可能为负，这个数字中仅包含数字1-9，现在定义一个1-9的置换，即指定将整数中的某个数字按顺序变换为另一个数字，请你输出变换以后的数字是多少。
 * <p>
 * 输入
 * 输入第一行包含一个整数a。(-10^1000<=a<=10^1000)
 * <p>
 * 输入第二行包含9个以空格隔开的整数a_i , 第i个整数表示将数字i替换为数字a_i。(1<=a_i<=9)
 * <p>
 * 输出
 * 请你输出数字变换之后的结果。
 * <p>
 * <p>
 * 样例输入
 * 1234567
 * 9 8 7 6 5 4 3 2 1
 * 样例输出
 * 9876543
 * <p>
 * 提示
 * 输入样例2
 * -12
 * 2 3 7 6 5 4 3 2 1
 * <p>
 * 输出样例2
 * -23
 * <p>
 * 输入样例3
 * 73598793378342493
 * 1 3 6 1 6 8 9 1 3
 * <p>
 * 输出样例3
 * 96631936691613136
 * @author: Seldom
 * @time: 2020/3/26 19:08
 */
public class Main {
    //public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
    //    String num = sc.nextLine();
    //    StringBuilder sb = new StringBuilder(num);
    //    String numr = sc.nextLine();
    //    String[] s = numr.split(" ");
    //    int index = 0;
    //    if (sb.charAt(0) == '-') {
    //        index = 1;
    //    }
    //    for (; index < sb.length(); index++) {
    //        if ((sb.charAt(index)-'0')<=s.length){
    //            sb.setCharAt(index, s[sb.charAt(index)-'0'-1].charAt(0));
    //        }
    //    }
    //    System.out.println(sb.toString());
    //}

    //public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
    //    String k = sc.nextLine();
    //    int k2 = Integer.parseInt(k);
    //    String s = sc.nextLine();
    //    String[] s1 = s.split(" ");
    //    int[] i5 = new int[s1.length];
    //    for (int i2 = 0; i2<s1.length; i2++){
    //        i5[i2] = Integer.parseInt(s1[i2]);
    //    }
    //    Arrays.sort(i5);
    //    int sum=0;
    //    boolean f = true;
    //    for (int i = s1.length-1; i>=0;i--){
    //        if (f){
    //            sum+=(Integer.parseInt(s1[i])*Integer.parseInt(s1[i]));
    //            f = false;
    //        }else {
    //            sum-=(Integer.parseInt(s1[i])*Integer.parseInt(s1[i]));
    //            f = true;
    //        }
    //    }
    //    DecimalFormat df = new DecimalFormat("0.00000");
    //    String format = df.format(Math.PI * sum);
    //    System.out.println(format);
    //}

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
