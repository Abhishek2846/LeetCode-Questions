class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101];

        for(int num : nums){
            freq[num]++;
        }

        int n = nums.length;

        int[] res = new int[n];

        int idx = 0;

        for(int num : nums){

            int count = 0;

            for(int i = num-1 ; i >= 0 ; i--){

                count += freq[i];

            }

            res[idx++] = count;
        }

        return res;
    }
}