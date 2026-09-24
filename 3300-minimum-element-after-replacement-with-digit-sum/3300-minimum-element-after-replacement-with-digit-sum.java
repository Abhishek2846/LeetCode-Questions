class Solution {
    public int minElement(int[] nums) {
        for(int i=0 ; i<nums.length ; i++)
        {
            int n = nums[i];
            int sum = 0;
            while(n>0)
            {
                int rem = n%10;
                sum += rem;
                n /= 10;
            }
            nums[i] = sum;
        }
        int min = nums[0];
        for(int i=0 ; i<nums.length ; i++)
        {
            if(min > nums[i])
                min = nums[i];
        }
        return min;
    }
}