class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int m = accounts[0].length;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            int sum2 = 0; 
            for(int j = 0 ; j < m ; j++){
                sum2 += accounts[i][j];
            }

            if(sum2 > sum) sum = sum2;
        }
        return sum;
    }
}