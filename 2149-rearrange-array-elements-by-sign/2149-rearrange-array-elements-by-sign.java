class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int n : nums){
            if(n < 0) neg.add(n);
            else pos.add(n);
        }

        for(int i = 0 ; i < nums.length ; i++){
           if(i%2 == 0) {
                nums[i] = pos.get(i/2);
            } else {
                nums[i] = neg.get(i/2);
            } 
        }
        
        return nums;
    }
}