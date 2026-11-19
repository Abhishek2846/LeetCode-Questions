//So , basically what we did over here is ,
// Sort the array nums in non-decreasing order.

// Since we can modify up to 2 elements, we can eliminate up to 2 extreme values from the ends of the sorted array by changing them to match an adjacent value (which also guarantees the minimum absolute difference becomes 0).

// There are only 3 optimal ways to remove 2 extremes:
// Case 1: Change the two smallest elements (nums[0] and nums[1]) to nums[2]. The new range is nums[n - 1] - nums[2].
// Case 2: Change the smallest (nums[0]) and the largest (nums[n - 1]) elements. The new range is nums[n - 2] - nums[1].
// Case 3: Change the two largest elements (nums[n - 1] and nums[n - 2]) to nums[n - 3]. The new range is nums[n - 3] - nums[0].

// Return the minimum of these three values.
class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        int opt1 = nums[n - 1] - nums[2];
        int opt2 = nums[n - 2] - nums[1];
        int opt3 = nums[n - 3] - nums[0];
        
        return Math.min(opt1, Math.min(opt2, opt3));
    }
}