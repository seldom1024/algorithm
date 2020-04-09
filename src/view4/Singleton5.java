package view4;

import java.util.*;
import java.lang.reflect.Constructor;

/**
 * @description:
 * @author: Seldom
 * @time: 2020/4/1 23:11
 */
public class Singleton5 {
    public static void main(String[] args) {
        try {
            Constructor con = Singleton3.class.getDeclaredConstructor();
            con.setAccessible(true);
            Singleton3 singleton1 = (Singleton3) con.newInstance();
            Singleton3 singleton2 = (Singleton3) con.newInstance();
            System.out.println(singleton1);
            System.out.println(singleton2);
            System.out.println(singleton1==singleton2);
            System.out.println(singleton1.equals(singleton2));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
