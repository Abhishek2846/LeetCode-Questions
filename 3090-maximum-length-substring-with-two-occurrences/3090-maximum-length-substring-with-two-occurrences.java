class Solution {
    public int maximumLengthSubstring(String s) {
        int [] arr = new int[26];
        int maxLen = Integer.MIN_VALUE;
        int i=0; 

        for(int j=0; j<s.length(); j++) {
            arr[s.charAt(j)-'a']++;

            while(arr[s.charAt(j)-'a']>2) {
                arr[s.charAt(i)-'a']--;
                i++;
            }
            maxLen = Math.max(maxLen,j-i+1);
        }

        return maxLen;
    }
}