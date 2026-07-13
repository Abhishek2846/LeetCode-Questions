class Solution {
    public void duplicateZeros(int[] arr) {
        int[] res = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length && j < arr.length; i++) {
            res[j++] = arr[i];

            if (arr[i] == 0 && j < arr.length) {
                res[j++] = 0;
            }
        }

        // upar return type void che etle aakho array pacho aama copy kairo
        for (int i = 0; i < arr.length; i++) {
            arr[i] = res[i];
        }
    }
}