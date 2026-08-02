class Solution {
    public int countValidPrefixes(String s) {
        int count0 = 0;
        int count1 = 0;
        int ans = 0;
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '1') {
                count1++;
            }
            else {
                count0++;
            }

            if(Math.abs(count1-count0)<=1) {
                ans++;
            }
        }
        return ans;
    }
}