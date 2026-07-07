class Solution {
    public int[] countBits(int n) {
        // int [] arr = new int [n+1];
        // for (int i = 0 ; i <= n ; i++){
        //     int count=0;
        //     String binary = Integer.toBinaryString(i);
        //     for(char c : binary.toCharArray()){
        //         if(c == '1'){
        //             count++;
        //         }
        //     }
        //     arr[i]=count;
        // }
        // return arr;

        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            int x = i;
            int count = 0;

            while (x != 0) {
                x = x & (x - 1);
                count++;
            }

            ans[i] = count;
        }

        return ans;
    }
}