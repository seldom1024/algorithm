package view4;

/**
 * @description: 静态内部类
 * @author: Seldom
 * @time: 2020/4/1 23:05
 */
public class Singleton3 {
    private static class LazyLoad{
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    private Singleton3(){}

    public static Singleton3 getInstance(){
        return LazyLoad.INSTANCE;
    }
}
