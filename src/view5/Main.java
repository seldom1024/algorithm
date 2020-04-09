package view5;

import java.util.*;
public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();
//        if (Integer.parseInt(s1)<1){
//            System.out.println(-1);
//            return;
//        }
//        String[] s = sc.nextLine().split(" ");
//        int[] sn = new int[s.length-1];
//        for(int i =0;i<sn.length;i++){
//            sn[i] = Integer.parseInt(s[i+1])-Integer.parseInt(s[i]);
//            if (sn[i] == 0){
//                System.out.println(-1);
//                return;
//            }
//        }
//        Arrays.sort(sn);
//        int max = 1;
//        for (int i=1;i<=sn[0];i++){
//            for (int j = 0; j<sn.length;j++){
//                if (j == sn.length - 1 && sn[j] % i == 0) {
//                    max = i;
//                    break;
//                }
//                if (sn[j]%i!=0){
//                    break;
//                }
//            }
//        }
//        System.out.println(max);
//    }

    //public static void main(String[] args) {
    //    HashMap<String, String> map = new HashMap<>();
    //    Scanner sc = new Scanner(System.in);
    //    String s = sc.nextLine();
    //    String[] s1 = s.split(" ");
    //    int n = Integer.parseInt(s1[0]);
    //    int m = Integer.parseInt(s1[1]);
    //    map.put(s1[2],s1[2]);
    //    if (m==0){
    //        System.out.println(1);
    //        return;
    //    }
    //    while (m>0){
    //        m--;
    //        String[] s2 = sc.nextLine().split(" ");
    //        boolean f = false;
    //        for (int i = 1; i<s2.length;i++) {
    //            if (map.containsKey(s2[i])){
    //                f =true;
    //                break;
    //            }
    //        }
    //        if (f){
    //            for (int i = 1; i<s2.length;i++) {
    //                map.put(s2[i],s2[i]);
    //            }
    //        }
    //    }
    //    System.out.println(Math.min(map.size(), n));
    //}

    //public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
    //    String[] s = sc.nextLine().split(" ");
    //    int n = Integer.parseInt(s[0]);
    //    int m = Integer.parseInt(s[1]);
    //    int[][] map = new int[n][m];
    //    for (int i = 0;i<n;i++){
    //        for (int j = 0;j<m;j++){
    //            map[i][j] = sc.nextInt();
    //        }
    //        sc.nextLine();
    //    }
    //    for (int i = 0;i<n;i++){
    //        for (int j = 0;j<m;j++){
    //            if (map[i][j]==1){
    //                map[i][i] = Math.max(lookDown(i, j, map), Math.max(lookUp(i, j, map), Math.max(lookR(i, j, map), lookL(i, j, map))));
    //            }
    //        }
    //    }
    //
    //    for (int i = 0;i<n;i++){
    //        for (int j = 0;j<m;j++){
    //            System.out.print(map[i][i]);
    //            if (j!=m-1){
    //                System.out.print(" ");
    //            }
    //        }
    //        System.out.println();
    //    }
    //}
    //
    //public static int lookR(int startH, int startL, int[][] map){
    //    int max = 0;
    //    startL++;
    //    for (;startL<map[0].length;startL++){
    //        if (map[startH][startL]>=1){
    //            return max;
    //        }
    //        max++;
    //    }
    //    return max;
    //}
    //public static int lookL(int startH, int startL, int[][] map){
    //    int max = 0;
    //    startL--;
    //    for (;startL>0;startL--){
    //        if (map[startH][startL]>=1){
    //            return max;
    //        }
    //        max++;
    //    }
    //    return max;
    //}
    //
    //public static int lookUp(int startH, int startL, int[][] map){
    //    int max = 0;
    //    startH--;
    //    for (;startH>0;startH--){
    //        if (map[startH][startL]>=1){
    //            return max;
    //        }
    //        max++;
    //    }
    //    return max;
    //}
    //
    //public static int lookDown(int startH, int startL, int[][] map){
    //    int max = 0;
    //    startH++;
    //    for (;startH<map.length;startH++){
    //        if (map[startH][startL]>=1){
    //            return max;
    //        }
    //        max++;
    //    }
    //    return max;
    //}
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(true);
    }
}
