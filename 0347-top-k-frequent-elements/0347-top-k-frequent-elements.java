class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // Convert map entries to array
        int[][] arr = new int[count.size()][2];

        int index = 0;

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            arr[index][0] = entry.getKey();   
            arr[index][1] = entry.getValue();  
            index++;
        }

        Arrays.sort(arr, (a, b) -> b[1] - a[1]);

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = arr[i][0];
        }

        return ans;
    }
}