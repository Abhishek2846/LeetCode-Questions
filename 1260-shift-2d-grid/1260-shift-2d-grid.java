class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int size = m*n;
        int [] arr = new int[size];
        int count = 0;

        //1d array ma convert kairu
        for(int i=0 ;i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                arr[count++] = grid[i][j];
            }
        }

        //1d array ma shift kairu
        int[] shifted = new int[size];
        for(int i=0;  i<arr.length; i++) {
            shifted[(i+k)%size] = arr[i];
        }

        //1d array ma thi pachu list of list ma convert kairu
        int idx = 0;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<m; i++) {
            List<Integer>row = new ArrayList<>();

            for(int j=0; j<n; j++) {
                row.add(shifted[idx++]);
            }

            list.add(row);
        }
        return list;   
    }
}