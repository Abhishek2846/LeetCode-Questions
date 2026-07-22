class Solution {
    public int maximumProduct(int[] nums) {

        //Tc O(nlogn)

        // int n = nums.length;
        // Arrays.sort(nums);
        // int max1 = nums[n-1] , max2 = nums[n-2] , max3 = nums[n-3];
        // int min1 = nums[0] , min2 = nums[1];

        // return Math.max(max1 * max2 * max3 , min1 * min2 * max1 );


        //Tc O(n)
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int n: nums) {
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }
            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }
        return Math.max(min1 * min2 * max1 ,  max1 * max2 * max3);


    }
}