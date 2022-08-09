package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public Integer val;

    public TreeNode() {

    }

    public TreeNode(int val) {
        this.val = val;
    }

    /**
     * 构造树
     *
     * @param nums 树节点列表
     * @return 树的根节点
     */
    public static TreeNode makeTree(Integer[] nums) {
        if (nums.length == 0 || nums[0] == null) {
            return null;
        }
        TreeNode root = new TreeNode(nums[0]);
        TreeNode cur;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int j = 1;
        while (!queue.isEmpty() && j < nums.length) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                cur = queue.poll();
                if (j < nums.length && nums[j] != null) {
                    cur.left = new TreeNode(nums[j]);
                    queue.offer(cur.left);
                }
                j++;
                if (j < nums.length && nums[j] != null) {
                    cur.right = new TreeNode(nums[j]);
                    queue.offer(cur.right);
                }
                j++;
            }
        }
        return root;
    }
}

