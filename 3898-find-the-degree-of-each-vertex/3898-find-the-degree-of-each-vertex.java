class Solution {
    public int[] findDegrees(int[][] matrix) {
        // int n = matrix.length;
        // int[] arr = new int[n];

        // for(int i = 0 ; i < n ; i++){
        //     for(int j = 0; j < n ; j++){
        //         arr[i] += matrix[i][j];
        //     }
        // }

        // return arr;

        int[] ans = new int[matrix.length];

        for (int i = 0; i < ans.length; i++) {
            int sum = 0;
            for (int j = 0; j < ans.length; j++) {
                sum += matrix[i][j];
            }
            ans[i] = sum;
        }

        return ans;
    }
}