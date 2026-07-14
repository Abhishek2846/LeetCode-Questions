class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int i = 0, j = 0, count = 0;
        int sum = 0;

        while (j < n) {
            sum += arr[j];
            if (j - i + 1 < k) //size < window size to j++
                j++;

            else { // window na size ni equal aavi jai to 
                if (sum >= k* threshold) count++;
                sum -= arr[i];
                i++; 
                j++;
            }
        }
        return count;
    }
}