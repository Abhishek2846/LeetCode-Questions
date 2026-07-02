class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;   

        for(int i = 2 ; i < n ; i++){
        cost[i] = cost[i] + Math.min(cost[i-1],cost[i-2]);
        }

    // because apde n ma place par javanu so tyathi apde puchiyu k n-1 mu k n-2 mu kyu nanu che so its min cost
    return Math.min(cost[n-1] , cost[n-2]);
    }
}