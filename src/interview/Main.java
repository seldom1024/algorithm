package interview;

/**
 * @description: 农场有n只鸡鸭排为一个队伍，鸡用“C”表示，鸭用“D”表示。当鸡鸭挨着时会产生矛盾。需要对所排的队伍进行调整，使鸡鸭各在一边。每次调整只能让相邻的鸡和鸭交换位置，现在需要尽快完成队伍调整，你需要计算出最少需要调整多少次可以让上述情况最少。例如：CCDCC->CCCDC->CCCCD这样就能使之前的两处鸡鸭相邻变为一处鸡鸭相邻，需要调整队形两次。
 *
 *
 * 输入描述:
 * 输入一个长度为N，且只包含C和D的非空字符串。
 *
 * 输出描述:
 * 使得最后仅有一对鸡鸭相邻，最少的交换次数
 *
 * 输入例子1:
 * CCDCC
 *
 * 输出例子1:
 * 2
 * @author: Seldom
 * @time: 2020/3/25 14:44
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s1);
        int def = def(sb1, 'D');
        int def1 = def(sb2, 'C');
        System.out.println(Math.min(def, def1));
    }

    public static int def(StringBuilder s, char l){
        int le = 0;
        int index = 0;
        int mu = 0;
        while (index<s.length()){
            if (s.charAt(index) == l){
                le++;
            }else {
                mu+=le;
            }
            index++;
        }
        return mu;
    }
}
