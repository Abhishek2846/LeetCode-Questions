class Solution {
    public int[] searchRange(int[] nums, int target) {

        //TC O(n)
        // int first = -1, last = -1;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == target) {
        //         if (first == -1) {
        //             first = i;
        //         }
        //         last = i;
        //     }
        // }
        // int[] res = {first,last};
        // return res;


        // TC O(nlogn)
        int[] ans = {-1, -1};
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);
        ans[0] = left;
        ans[1] = right;
        return ans;        
    }

    public int binarySearch(int[] nums, int target, boolean isSearchingLeft) {
        int left = 0;
        int right = nums.length - 1;
        int idx = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                idx = mid;
                if (isSearchingLeft) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return idx;
    }
}