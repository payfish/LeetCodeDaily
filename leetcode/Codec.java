package leetcode;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

/**
 * TreeNode serialize and deserialize.
 */
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode tem = q.poll();
            if (tem.val == 1001) {
                sb.append("null ");
                continue;
            } else {
                sb.append(tem.val).append(" ");
            }
            q.offer(Objects.requireNonNullElseGet(tem.left, () -> new TreeNode(1001)));
            if (tem.right != null) {
                q.offer(tem.right);
            } else {
                q.offer(new TreeNode(1001));
            }
        }
        String s = sb.toString();
        int n = s.length();
        int i = n - 1;
        for (; i >= 0; i -= 1) {
            if(Character.isDigit(s.charAt(i))) {
                break;
            }
        }
        return s.substring(0, i + 1);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("")) {
            return null;
        }
        String []s = data.split(" ");
        int n = s.length;
        Queue<TreeNode> q = new ArrayDeque<>();
        TreeNode root = new TreeNode(Integer.parseInt(s[0]));
        q.offer(root);
        int j = 1;
        TreeNode cur;
        while (!q.isEmpty() && j < n) {
            int size = q.size();
            while (size > 0 && j < n) {
                cur = q.poll();
                if (!s[j].equals("null")) {
                    cur.left = new TreeNode(Integer.parseInt(s[j]));
                    q.offer(cur.left);
                } else {
                    cur.left = null;
                }
                j += 1;
                if (j < n && !s[j].equals("null")) {
                    cur.right = new TreeNode(Integer.parseInt(s[j]));
                    q.offer(cur.right);
                } else {
                    cur.right = null;
                }
                j += 1;
                size -= 1;
            }
        }
        return root;
    }
}
