class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;

        for (int i = 2; i < nums.length; i++) {
           
            //  current number ane number at k - 2 sarkha che, etle i ne move karo. etle aapdi pase atyare same number 3 time che ek sathe . So k eni same index upar rehse number ne update karva next time.
            if (nums[i] != nums[k - 2]) {

                // Current number sarkho nthi k - 2 element hare. etle update karo k ne current number sathe , then move k to next.
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}