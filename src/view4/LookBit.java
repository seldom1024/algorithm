package view4;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

/**
 * @description:
 * @author: Seldom
 * @time: 2020/4/4 12:20
 */
public class LookBit {
    //public static void main(String[] args) {
    //    //    Scanner sc = new Scanner(System.in);
    //    //    int n = Integer.parseInt(sc.nextLine());
    //    //    String s = sc.nextLine();
    //    //    int lookup = lookup(n, s);
    //    //    System.out.println(lookup);
    //    //}
    //    //
    //    //public static int lookup(int n, String s){
    //    //    if (s.length()==0){
    //    //        return 0;
    //    //    }
    //    //    int i = 0;
    //    //    int j = 0;
    //    //    int num = 0;
    //    //    int count = 0;
    //    //    int zero = 0;
    //    //    if (n==0){
    //    //        while (j<s.length()){
    //    //            if (s.charAt(j)=='0'){
    //    //                count++;
    //    //                j++;
    //    //            }else {
    //    //                num += (count+1)*count/2;
    //    //                j++;
    //    //                count=0;
    //    //            }
    //    //        }
    //    //        num += (count+1)*count/2;
    //    //        return num;
    //    //    }
    //    //    for (int k=0;k<s.length();k++){
    //    //        if (s.charAt(k)=='1'){
    //    //            num++;
    //    //        }
    //    //        if (num==n){
    //    //            j = k;
    //    //            count++;
    //    //            break;
    //    //        }
    //    //    }
    //    //    if (num!=n)return 0;
    //    //    while (j<s.length()){
    //    //        if (s.charAt(i)=='0'){
    //    //            i++;
    //    //            count++;
    //    //            zero++;
    //    //        }else {
    //    //            j++;
    //    //            if (j<s.length()&&s.charAt(j)=='1'){
    //    //                i++;
    //    //                count++;
    //    //                zero=0;
    //    //            }
    //    //            else if (j<s.length()&&s.charAt(j)=='0'){
    //    //                count++;
    //    //                count+=zero;
    //    //            }
    //    //        }
    //    //    }
    //    //    return count;
    //    //}

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();
        scanner.nextLine();
        String s=scanner.nextLine();

        int num=0;
        //int[] dp=new int[k+2];
        int[] dp=new int[s.length()];
        System.out.println(dp[3]);
        long result=0;
        dp[0]=1;
        for(char c:s.toCharArray()){
            if(c=='1') num++;
            if(num-k>=0) result+=dp[num-k];
            dp[num]++;
        }
        //for(char c:s.toCharArray()){
        //    //计数1的个数
        //    if(c=='1') num++;
        //    //1的个数达到要求
        //    if(num-k>=0) {
        //        result+=dp[(num-k)%(k+2)];
        //    }
        //    dp[(num+1)%(k+2)]=0;
        //    dp[num%(k+2)]++;
        //}
        System.out.println(result);
    }
}
