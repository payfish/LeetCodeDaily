package leetcode;

import org.junit.Test;
import org.junit.Assert;
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


}
