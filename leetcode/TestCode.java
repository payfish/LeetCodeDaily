package leetcode;

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

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


}
