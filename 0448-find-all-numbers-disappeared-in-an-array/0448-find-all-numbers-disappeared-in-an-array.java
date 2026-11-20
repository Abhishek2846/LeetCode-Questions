class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Set<Integer> numSet = new HashSet<>();
        // for (int num : nums) {
        //     numSet.add(num);
        // }
        
        // List<Integer> result = new ArrayList<>();
        // for (int i = 1; i <= nums.length; i++) {
        //     if (!numSet.contains(i)) {
        //         result.add(i);
        //     }
        // }
        
        // return result;   

        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] > 0) {
                nums[idx] *= -1;
            }
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;       
    }
}