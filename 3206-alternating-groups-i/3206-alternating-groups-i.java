class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count = 0;
        int n = colors.length;

        for(int i=0; i<n; i++) {
            int j = (i+1)%n;
            int k = (i+2)%n;

            if(colors[i] != colors[j]&&colors[j]!=colors[k]) {
                count++;
            }
        } 
        return count;
    }
}