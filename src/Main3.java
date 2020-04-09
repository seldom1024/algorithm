import java.util.HashMap;
import java.util.Scanner;

/**
 * @description: 题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * @author: Seldom
 * @time: 2020/4/1 16:32
 */

public class Main3 {
    //public static void main(String[] args){
    //    int sum = 0;
    //    for(int i=1;i<=4;i++){
    //        for(int j=1;j<=4;j++){
    //            for(int k=1;k<=4;k++){
    //                if(i!=j&&i!=k&&j!=k){
    //                    System.out.println(i*100+j*10+k);
    //                    sum++;
    //                }
    //            }
    //        }
    //    }
    //    System.out.println(sum);
    //}

    //public static void main(String [] args) {
    //    Scanner sc = new Scanner(System.in);
    //    String s = sc.nextLine();
    //    int sum = 0;
    //    HashMap<String,String> map=new HashMap<>();
    //    String[] s1 = s.split(" ");
    //    for (String s2 : s1) {
    //        if (!map.containsKey(s2)) {
    //            map.put(s2, s2);
    //            sum++;
    //        }
    //    }
    //    System.out.println(sum);
    //}

    //public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
    //    int score = sc.nextInt();
    //    String level = score>=90?"A":(score>=60?"B":"C");
    //    System.out.println(level);
    //}



    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
            String mail = str.nextLine();
            String reg = "[\\w]+@[\\w]+.[\\w]";
            if (mail.matches(reg)) {
                System.out.println("邮箱地址合法！");
            } else {
                System.out.println("邮箱地址不合法！");
            }
    }
}



