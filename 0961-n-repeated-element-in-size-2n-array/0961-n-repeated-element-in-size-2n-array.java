class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        int ans = nums[n-1];
        for(int i = 0;i<n-2;i++){
            if(nums[i]==nums[i+1] || nums[i]==nums[i+2]) {
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}