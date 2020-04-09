package view4;

import dynamic.CheckSubarraySum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;

/**
 * @description:
 * @author: Seldom
 * @time: 2020/4/2 12:43
 */
public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Object o = new Object();
        o.hashCode();

    }

    public static boolean check(String s){
        if (s.length()<1){
            return false;
        }
        Stack<Character> stack =new Stack<>();
        for (int i = 0; i<s.length();i++){
            if (s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='('){
                //stack.push()
            }else {

            }
        }
        return false;
    }
}
