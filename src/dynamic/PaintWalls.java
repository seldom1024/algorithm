package dynamic;

/**
 * @description: X国的一段古城墙的顶端可以看成 2*N个格子组成的矩形（如下图所示），现需要把这些格子刷上保护漆。
 * (https://blog.csdn.net/weixin_44737877/article/details/103382684)
 * @author: Seldom
 * @time: 2019/12/5 9:08
 */
public class PaintWalls {

    private static int MOD = 1000000007;

    private static void paintWalls(int n) {
        long[] d = new long[n + 1];
        long[] a = new long [n + 1];

        d[1] = 1;
        d[2] = 2;

        //a[n]表示起点为某一角落长度为n终点任意的情况数
        a[1] = 1;
        a[2] = 6;
        for (int i = 3; i <= n; i++) {
            d[i] = (2 * d[i - 1]) % MOD;
            a[i] = (2 * a[i - 1] + d[i] + 4 * a[i - 2]) % MOD;
        }
        long ans = 4*a[n];
        for (int i=2;i<n;i++){
            ans = (ans + 8*a[i-1]*d[n-i])%MOD;
            ans = (ans + 8*a[n-i]*d[i-1])%MOD;
        }
        if (n == 1){
            System.out.println(2);
            return;
        }
        if (n == 2){
            System.out.println(24);
            return;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        paintWalls(200);
    }
}
