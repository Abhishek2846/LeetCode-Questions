class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int size = m*n;
        int [] arr = new int[size];
        int count = 0;

        //1d array ma convert kairu
        for(int i=0 ;i<m; i++) {
            for(int j=0; j<n; j++) {
                arr[count++] = matrix[i][j];
            }
        }

        Arrays.sort(arr);
        return arr[k-1];
    }
}