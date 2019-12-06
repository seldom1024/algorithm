package dynamic;

/**
 * @description: 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * @author: Seldom
 * @time: 2019/12/6 19:11
 */
public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int num:nums){
            if (sum>0){
                sum+=num;
            }else {
                sum=num;
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
