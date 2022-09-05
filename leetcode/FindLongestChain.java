package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class FindLongestChain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));
        int n = pairs.length, res = 1, i = 0, j;
        while (i < n - 1) {
            for (j = i + 1; j < n; j += 1) {
                if (pairs[i][1] < pairs[j][0]) {
                    res += 1;
                    i = j;
                    break;
                }
            }
            if (j == n) {
                break;
            }
        }
        return res;
    }
}
