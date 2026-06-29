class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int z1 = 0 ;
        int z2 = 0 ;
        long sum1 = 0;
        long sum2 = 0;

        for(int num : nums1){
            if(num == 0){
                z1++;
                sum1+=1;
            }
            else{
                sum1 += num;
            }
        }

        for(int num : nums2){
            if(num == 0){
                z2++;
                sum2+=1;
            }
            else{
                sum2 += num;
            }
        }

        if(sum1 < sum2 && z1 == 0)
            return -1;

        if(sum2 < sum1 && z2 == 0)
            return -1;

        return Math.max(sum1 , sum2);
    }
}