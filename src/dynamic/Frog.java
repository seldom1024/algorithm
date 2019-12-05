package dynamic;

/**
 * @description: 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @類似問題 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * n = 1,只有一種
 * n= 2 有两种
 *      对于n>=3:怎么能覆盖到三？
 * 只有两种办法，从n-1的地方竖着放了一块，或者从n-2的位置横着放了两块
 * @author: Seldom
 * @time: 2019/12/2 16:25
 */
public class Frog {

    public static long frog(int n){
        long a = 1;
        long b = 2;
        long tem;
        for(int i =3;i<=n;i++){
            tem = a;
            a = b;
            b = tem+b;
        }
        return n>=2?b:a;
    }
    
    public static void main(String[] args) {
        System.out.println(frog(500));
    }
}
