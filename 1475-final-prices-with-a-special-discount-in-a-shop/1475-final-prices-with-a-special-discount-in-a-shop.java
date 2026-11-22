class Solution {
    public int[] finalPrices(int[] prices) {
        int i = 0 , j = 1;
        int [] answer = new int[prices.length];
        while(i < prices.length ){
            if(j < prices.length && prices[j] <= prices[i]) {
                answer[i] = prices[i] - prices[j];
                i++;
                j = i + 1;
            }
            else if(j < prices.length) {
                j++;
            }
            else {
                answer[i] = prices[i];
                i++;
                j = i + 1;
            }

        }
        return answer;
    }
}