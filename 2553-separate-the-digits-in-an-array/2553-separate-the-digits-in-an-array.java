class Solution {
    public int[] separateDigits(int[] nums) {
        // List<Integer> result = new ArrayList<>();

        // for (int num : nums) {
        //     List<Integer> digits = new ArrayList<>();
        //     while (num > 0) {
        //         digits.add(num % 10);
        //         num /= 10;
        //     }

        //     // Reverse to maintain left-to-right order
        //     for (int i = digits.size() - 1; i >= 0; i--) {
        //         result.add(digits.get(i));
        //     }
        // }

        // int[] ans = new int[result.size()];

        // for (int i = 0; i < result.size(); i++) {
        //     ans[i] = result.get(i);
        // }
        // return ans;

        //Easy method
        StringBuilder sb = new StringBuilder();

        for (int num : nums) {
            sb.append(num);
        }

        int length = sb.length();
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = sb.charAt(i) - '0';
        }

        return result;
    }
}