package view4;

import java.util.Scanner;
import java.util.Stack;

/**
 * @description: 表达式求值
 * 时间限制：C/C++ 1秒，其他语言2秒
 *
 * 空间限制：C/C++ 256M，其他语言512M
 *
 * 给出一个布尔表达式的字符串，比如：true or false and false，表达式只包含true，false，and和or，现在要对这个表达式进行布尔求值，计算结果为真时输出true、为假时输出false，不合法的表达时输出error（比如：true true）。表达式求值是注意and 的优先级比 or 要高，比如：true or false and false，等价于 true or (false and false)，计算结果是 true。
 *
 *
 * 输入描述:
 * 输入第一行包含布尔表达式字符串s，s只包含true、false、and、or几个单词（不会出现其它的任何单词），且单词之间用空格分隔。 (1 ≤ |s| ≤ 103).
 *
 * 输出描述:
 * 输出true、false或error，true表示布尔表达式计算为真，false表示布尔表达式计算为假，error表示一个不合法的表达式。
 *
 * 输入例子1:
 * and
 *
 * 输出例子1:
 * error
 *
 * 输入例子2:
 * true and false
 *
 * 输出例子2:
 * false
 *
 * 输入例子3:
 * true or false and false
 *
 * 输出例子3:
 * true
 * @author: Seldom
 * @time: 2020/4/5 11:24
 */
public class Main12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        String check = check(s1);
        System.out.println(check);
    }

    public static String check(String[] strings){
        Stack<String> stack = new Stack<>();
        if ("or".equals(strings[0])||"and".equals(strings[0])){
            return "error";
        }
        stack.push(strings[0]);
        for (int i = 1; i<strings.length; i++) {
            if ("and".equals(strings[i])){
                if (stack.isEmpty()||stack.peek().equals("and")||stack.peek().equals("or")){
                    return "error";
                }else {
                    String pop = stack.pop();
                    i++;
                    if (i>=strings.length){
                        return "error";
                    }
                    if (pop.equals("false")||"false".equals(strings[i])){
                        stack.push("false");
                    }else {
                        stack.push("true");
                    }
                }
            }
            else if ("or".equals(strings[i])){
                if (stack.isEmpty()||stack.peek().equals("and")||stack.peek().equals("or")){
                    return "error";
                }else {
                    stack.push("or");
                    if (i+1>=strings.length){
                        return "error";
                    }
                }
            }
            else {
                if (stack.peek().equals("true")||stack.peek().equals("false")){
                    return "error";
                }else {
                    stack.push(strings[i]);
                }
            }
        }
        while (!stack.isEmpty()){
            String pop = stack.pop();
            if ("true".equals(pop)){
                return "true";
            }
        }
        return "false";
    }


}
