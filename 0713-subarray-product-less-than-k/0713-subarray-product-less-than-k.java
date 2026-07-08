class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;  
        int i = 0, ans = 1, count = 0;
        
        for (int j = 0; j < nums.length; j++) {
            ans *= nums[j];
            
            while (ans >= k && i <= j) {
                ans /= nums[i];
                i++;
            }
            
            count += j - i + 1;
        }
        
        return count;
    }
}