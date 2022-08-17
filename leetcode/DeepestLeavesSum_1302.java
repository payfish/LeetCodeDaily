package leetcode;

public class DeepestLeavesSum_1302 {

    private int maxdeep = 0;
    private int maxsum = 0;

    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return maxsum;
    }

    public void dfs(TreeNode root,int depth) {
        if (root == null) {
            return;
        }
        if (depth == maxdeep) {
            maxsum += root.val;
        }
        else if (depth > maxdeep) {
            maxdeep = depth;
            maxsum = root.val;
        }
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}
