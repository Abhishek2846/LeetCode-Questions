class Solution {
    public int maxProfit(int[] prices) {

        int least  = prices[0] ;
        int maximum = 0;

        for(int i = 1 ; i < prices.length ; i++){
            if(prices[i] < least){
                least = prices[i];
            }
            else if (prices[i] - least > maximum){
                maximum = prices[i] - least;
            }
        }

        return maximum;
    }
}