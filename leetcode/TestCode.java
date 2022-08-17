package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class TestCode {
    @Test
    public void validSqure() {
        int[]p1 = {1134,-2539}, p2 = {492,-1255}, p3 = {-792,-1897}, p4 = {-150,-3181};
        validSquare_593 res = new validSquare_593();
        boolean ok = res.validSquare(p1, p2, p3, p4);
        assertTrue(ok);
    }

    @Test
    public void Test899() {
        String s = "auekjdjeqqa";
        OrderlyQueue_899 test = new OrderlyQueue_899();
        String res = test.orderlyQueue(s, 1);
        System.out.println(res);
    }

    @Test
    public void Test636() {
        int n = 2;
        String []s = {"0:start:0","0:start:2","0:end:5","1:start:6","1:end:6","0:end:7"};
        List<String> logs = new ArrayList<>();
        for (String s1 : s) {
            logs.add(s1);
        }
        FuncExclusiveTime_636 fet = new FuncExclusiveTime_636();
        int []res = fet.exclusiveTime(n, logs);
        System.out.println(Arrays.toString(res));
    }

    @Test
    public void Test322() {
        int amount = 8;
        int []coins = {2,5};
        CoinChange_322 cc = new CoinChange_322();
        int res = cc.coinChange(coins, amount);
        System.out.println(res);
    }

    /**
     * 8/9/2022 14:52
     */
    @Test
    public void Test103() {
        Integer []o = {0,2,4,1,null,3,-1,5,1,null,6,null,8};
        TreeNode root = TreeNode.makeTree(o);
        ZigzagLevelOrder_103 zlo = new ZigzagLevelOrder_103();
        List<List<Integer>> res = zlo.zigzagLevelOrder(root);
        System.out.println(res);
    }

    /**
     * 8/17/2022 10:39
     */
    @Test
    public void Test1302() {
        Integer []o = {1,2,3,4,5,null,6,7,null,null,null,null,8};
        TreeNode root = TreeNode.makeTree(o);
        DeepestLeavesSum_1302 dls = new DeepestLeavesSum_1302();
        int res = dls.deepestLeavesSum(root);
        System.out.println(res);
    }
}
