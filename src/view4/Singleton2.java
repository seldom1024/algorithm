package view4;

/**
 * @description:
 * @author: Seldom
 * @time: 2020/4/1 22:49
 */
public class Singleton2 {

    private static Singleton2 instance = null;
    private Singleton2(){}
    public static Singleton2 getSingleton(){
        if (instance==null){
            synchronized(Singleton2.class){
                if (instance==null){
                    instance  = new Singleton2();
                }
            }
        }
        return instance;
    }
}
