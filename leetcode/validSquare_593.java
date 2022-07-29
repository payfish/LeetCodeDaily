package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 计算每两个点距离^2，检查结果是否满足（1.相同边长数量==4；2.短边长的二倍为斜边长度）即可
 */

public class validSquare_593 {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int [][]p = {p1, p2, p3, p4};
        List<Integer> ll = new ArrayList<>();
        for(int i = 0; i < 3; i += 1) {
            for(int j = i+1; j < 4; j += 1) {
                ll.add(distance(p[i], p[j]));
            }
        }
        int maxi = 0;
        int mini = Integer.MAX_VALUE;
        for(int i : ll) {
            maxi = Math.max(i, maxi);
            mini = Math.min(i, mini);
        }
        int numd = 0;
        for(int i : ll) {
            if(i == mini) {
                numd += 1;
            }
        }
        if(numd != 4 || (mini * 2) != maxi) {
            return false;
        }
        return true;
    }

    public int distance(int p[], int q[]) {
        return (p[0] - q[0]) * (p[0] - q[0]) + (p[1] - q[1]) * (p[1] - q[1]);
    }
}
