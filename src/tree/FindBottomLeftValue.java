package tree;


/**
 * @description: 给定一个二叉树，在树的最后一行找到最左边的值。
 *
 * 示例 1:
 *
 * 输入:
 *
 *     2
 *    / \
 *   1   3
 *
 * 输出:
 * 1
 *  
 *
 * 示例 2:
 *
 * 输入:
 *
 *         1
 *        / \
 *       2   3
 *      /   / \
 *     4   5   6
 *        /
 *       7
 *
 * 输出:
 * 7
 *  
 *
 * 注意: 您可以假设树（即给定的根节点）不为 NULL。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-bottom-left-tree-value
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: Seldom
 * @time: 2019/12/26 22:22
 */
public class FindBottomLeftValue {
    int ans = -1;
    int maxH = -1;

    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return ans;
    }

    public void dfs(TreeNode root, int h) {
        if(root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (h > maxH) {
                maxH = h;
                ans = root.val;
            }
        }
        dfs(root.left, h + 1);
        dfs(root.right, h + 1);
    }
}
