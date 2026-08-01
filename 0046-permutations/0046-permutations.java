class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtrack(ans, new ArrayList<>(), nums, used);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans,List<Integer> temp,int[] nums,boolean[] used) {

        // If the current permutation contains all elements,
        // add a copy of it to the answer.
        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        // Try every number as the next element
        for (int i = 0; i < nums.length; i++) {

            // Skip if this number is already used
            if (used[i]) {
                continue;
            }

            used[i] = true;

            // Add the current number to the permutation
            temp.add(nums[i]);

            // Recursively build the remaining permutation
            backtrack(ans, temp, nums, used);

            // Remove the last added number
            temp.remove(temp.size() - 1);

            // Mark it as unused so it can be used in other permutations
            used[i] = false;
        }
    }
}