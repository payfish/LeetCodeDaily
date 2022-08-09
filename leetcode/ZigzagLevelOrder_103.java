package leetcode;

import java.util.*;

/**
 * @author payfish
 * 2022/8/9 14:50
 */
public class ZigzagLevelOrder_103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> d = new ArrayDeque<>();
        d.add(root);
        int level = 1;
        while (!d.isEmpty()) {
            int size = d.size();
            List<Integer> tem = new ArrayList<>();
            while (size > 0) {
                TreeNode r = d.remove();
                tem.add(r.val);
                if (r.left != null) {
                    d.add(r.left);
                }
                if (r.right != null) {
                    d.add(r.right);
                }
                size -= 1;
            }
            if (level % 2 == 0) {
                Collections.reverse(tem);
            }
            res.add(tem);
            level += 1;
        }
        return res;
    }

    /**
     * 明明正常遍历再反转就行了，居然用双端队列搞了半天，还把自己绕晕了。。。
     */
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        List<List<Integer>> res = new ArrayList<>();
//        Deque<TreeNode> d = new ArrayDeque<>();
//        d.addLast(root);
//        int level = 1;
//        while (!d.isEmpty()) {
//            int size = d.size();
//            List<Integer> tem = new ArrayList<>();
//            while (size > 0) {
//                TreeNode r;
//                if (level % 2 != 0) {
//                    r = d.removeLast();
//                } else {
//                    r = d.removeFirst();
//                }
//
//                tem.add(r.val);
//
//                if (level % 2 != 0) {
//                    if (r.right != null) {
//                        d.addFirst(r.right);
//                    }
//                    if (r.left != null) {
//                        d.addFirst(r.left);
//                    }
//                } else {
//                    if (r.right != null) {
//                        d.addLast(r.right);
//                    }
//                    if (r.left != null) {
//                        d.addLast(r.left);
//                    }
//                }
//
//
//                size -= 1;
//            }
//            res.add(tem);
//            level += 1;
//        }
//        return res;
//    }
}
