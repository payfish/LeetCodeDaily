package leetcode;

import java.util.Arrays;

/**
 * Hard 2022/8/3
 */
public class OrderlyQueue_899 {
    public String orderlyQueue(String s, int k) {
        char []c = s.toCharArray();
        if (k > 1) {
            Arrays.sort(c);
            return String.valueOf(c);
        }
        String mins = s;
        for (int p = 0; p < c.length; p += 1) {
            char temc = c[0];
            System.arraycopy(c, 1, c, 0, c.length - 1);
            c[c.length-1] = temc;
            mins = mincomp(mins, String.valueOf(c));
        }
        return mins;
    }

    public String mincomp(String s1, String s2) {
        for (int i = 0; i < s1.length(); i += 1) {
            if (s1.charAt(i) == s2.charAt(i)) {
                continue;
            }
            if (s1.charAt(i) < s2.charAt(i)) {
                return s1;
            } else {
                return s2;
            }
        }
        return s1;
    }
}
