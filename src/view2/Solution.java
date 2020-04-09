package view2;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @description: 回溯
 *
 * @author: Seldom
 * @time: 2020/3/30 10:31
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        sc.nextLine();
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        int[] num = new int[s1.length];
        for (int i = 0; i<s1.length;i++){
            num[i] = Integer.parseInt(s1[i]);
        }
    }
        public static List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            int[] visited = new int[nums.length];
            backtrack(res, nums, new ArrayList<Integer>(), visited, 0);
            return res;

        }

        private static void backtrack(List<List<Integer>> res, int[] nums, ArrayList<Integer> tmp, int[] visited, int index) {
            if (index == nums.length) {
                res.add(new ArrayList<>(tmp));
                return;
            }
            for (int i = index; i < nums.length; i++) {
                if (visited[i] == 1) continue;
                visited[i] = 1;
                tmp.add(nums[i]);
                backtrack(res, nums, tmp, visited, i);
                visited[i] = 0;
                tmp.remove(tmp.size() - 1);
            }
        }
}
