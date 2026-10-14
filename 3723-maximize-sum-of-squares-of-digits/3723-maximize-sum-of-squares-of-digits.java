// If sum > 9 * num, it is impossible to reach that sum with num digits, so return "".
// Take k = sum / 9 nines, and let r = sum % 9 be the leftover.
// Build the answer as k nines, then r (if r > 0), then zeros to fill up to num digits.
// The result is always valid. The first digit is non-zero because sum >= 1 means either k >= 1 or  r > 0. The length never exceeds num: if k == num, then sum <= 9 * num forces r = 0.
class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num)
            return "";

        int k = sum / 9;
        int r = sum % 9;

        StringBuilder sb = new StringBuilder(num);
        
        for (int i = 0; i < k; i++)
            sb.append('9');
        
        if (r > 0)
            sb.append((char) ('0' + r));
        
        while (sb.length() < num)
            sb.append('0');
        
        return sb.toString();
    }
}