class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] seen = new boolean[101];

        for (int num : nums) {
            seen[num] = true;
        }

        for (int multiple = k; ; multiple += k) {
            if (multiple > 100 || !seen[multiple]) {
                return multiple;
            }
        }
    }
}