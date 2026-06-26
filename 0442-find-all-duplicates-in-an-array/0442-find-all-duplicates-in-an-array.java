class Solution {
    public List<Integer> findDuplicates(int[] nums) {

         List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            int idx = num - 1;

            if (nums[idx] < 0) {
                result.add(num);
            } else {
                nums[idx] = -nums[idx];
            }
        }

        return result;

        //O(n^2);
        // Arrays.sort(nums);
        // List<Integer> numbers = new ArrayList<>();
        // for(int i = 0 ; i < nums.length-1 ; i++){
        //     if(nums[i] == nums[i+1]){
        //         numbers.add(nums[i]);
        //     }
        //     continue;
        // }
        // return numbers;
    }
}