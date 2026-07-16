class Solution {
    public int gcd(int a, int b) {
        if( b == 0 ) return a ;
        
        return gcd(b, a % b); 
        }

    public long gcdSum(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            nums[i] = gcd(nums[i], max);
        }

        Arrays.sort(nums);

        long res = 0; 
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            res += gcd(nums[start], nums[end]);
            start++;
            end--;
        }
            

        return res;
    }
}