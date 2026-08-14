class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
         int n = nums.length;

        int i=0;
        Arrays.sort(nums);

        while(k>0&&i<n) {
            if(nums[i]<0) {
                nums[i] = -nums[i];
                k--;
            }
            else {
                break;
            }
        i++;
        }

        Arrays.sort(nums);

        if(k%2 != 0) {
            nums[0] = -nums[0];
        }

        int sum = 0;

        for(int p=0; p<nums.length; p++) {
            sum+=nums[p];
        }

        return sum;
    }
}