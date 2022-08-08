package leetcode;

import java.util.Arrays;

public class CoinChange_322 {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int n = coins.length;
        int []dp = new int[amount+1];
        dp[0] = 0;
        for (int i = 1; i < amount+1; i += 1) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j += 1) {
                int idx = i - coins[j];
                if (idx >= 0 && dp[idx] != -1) {
                    min = Math.min(min, dp[idx]);
                }
            }
            if (min == Integer.MAX_VALUE) {
                dp[i] = -1;
            } else {
                dp[i] = min + 1;
            }
        }
        return dp[amount];
    }
}
