class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;

        //aama aakho array reverse thase
        reverse(nums,0,n-1);
        //pela k elements reverse thase
        reverse(nums,0,k-1);
        //baki na elements reverse thase
        reverse(nums,k,n-1);

        }

        public void reverse(int[]nums,int start,int end){
        while(start<end){

        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;

        start++;
        end--;

        }
    }
}