package LeetCode;

import java.util.Arrays;

public class CoinChange_322 {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[] {1, 2, 5}, 11));
    }

    public static int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }

        if (coins.length == 1) {
            if (amount % coins[0] == 0) {
                return amount / coins[0];
            }
            return -1;
        }

        Arrays.sort(coins);

        int res = 0;

        for (int i = coins.length - 1; i >= 0; i--) {
            if (coins[i] <= amount) {
                res += (amount / coins[i]);
                amount -= (coins[i] * (amount / coins[i]));
            }
        }
        return res == 0 ? -1 : res;
    }
}
