package dynamic;

import java.util.HashMap;
import java.util.Random;

/**
 * @description: 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: Seldom
 * @time: 2019/12/11 17:51
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                return new int[]{i, map.get(target - nums[i])};
            }
        }
        return null;
    }

    /*public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        Random ad = new Random();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int i;
        while (true) {
            i = ad.nextInt(nums.length);
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                return new int[]{i, map.get(target - nums[i])};
            }
        }
    }*/

    public static void main(String[] args) {
        while (true) {
            System.out.println(new Random().nextInt(5));
        }
    }
}
