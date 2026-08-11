class Solution {
    public int coinChange(int[] coins, int amount) {

        // dp[i] = minimum number of coins needed to make amount i
        int[] dp = new int[amount + 1];

        // Fill with a value greater than any possible answer
        Arrays.fill(dp, amount + 1);

        // 0 coins are needed to make amount 0
        dp[0] = 0;

        // Calculate answer for every amount from 1 to amount
        for (int i = 1; i <= amount; i++) {

            for (int coin : coins) {

                // We can use this coin if it is not bigger than i
                if (coin <= i) {

                    // Take the minimum:
                    // current answer OR
                    // answer for remaining amount + 1 coin
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // If dp[amount] was never updated, return -1
        if (dp[amount] == amount + 1) {
            return -1;
        }

        return dp[amount];
    }
}