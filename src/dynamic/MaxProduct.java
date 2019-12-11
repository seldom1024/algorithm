package dynamic;

/**
 * @description:
 * @author: Seldom
 * @time: 2019/12/10 13:42
 */
public class MaxProduct {
    /*public static int maxProduct(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        int fmax = nums[0];
        int max = 0;
        int min = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                max = Math.max(max * nums[i], nums[i]);
                min = Math.min(min * nums[i], nums[i]);
            } else {
                int tem = min;
                min = Math.min(max * nums[i], nums[i]);
                max = Math.max(tem * nums[i], nums[i]);
            }
            fmax = Math.max(fmax, max);
        }
        return fmax;
    }*/

    public static int maxProduct(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int fmax = nums[0];
        int max = 0;
        int min = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int tem = min;
                min = max;
                max = tem;
            }
            max = Math.max(max * nums[i], nums[i]);
            min = Math.min(min * nums[i], nums[i]);
            fmax = Math.max(fmax, max);
        }
        return fmax;
    }

    public static void main(String[] args) {
        int[] a = {2, 0, 3, 0, -2, 4};
        int i = maxProduct(a);
        System.out.println(i);
    }
}
