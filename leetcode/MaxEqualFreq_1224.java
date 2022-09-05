package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * unable to finish the task -_-
 */
public class MaxEqualFreq_1224 {
    public int maxEqualFreq(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        for (int i = n - 1; i >= 0; i -= 1) {
            if(isMax(mp)) {
                return i + 1;
            }
            mp.put(nums[i], mp.get(nums[i]) - 1);
        }
        return 1;
    }
    public boolean isMax(Map<Integer, Integer> mp) {
        if (mp.size() == 1) {
            return true;
        }
        Set<Map.Entry<Integer, Integer>> entry = mp.entrySet();
        int max = 0, cnt = 0, min = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> e : entry) {
            int tem = e.getValue();
            max = Math.max(tem, max);
            min = Math.min(tem, min);
        }

        int maxnum = 0, minnum = 0;
        for (Map.Entry<Integer, Integer> e : entry) {
            int tem = e.getValue();
            if (tem == max) {
                maxnum += 1;
            } else if (tem == min) {
                minnum += 1;
            }
        }
        return maxnum == 1 || (min == 1 && minnum == 1);
    }
}
