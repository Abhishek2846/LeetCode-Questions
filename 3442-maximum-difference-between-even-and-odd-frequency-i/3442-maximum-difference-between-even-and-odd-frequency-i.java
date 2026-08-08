class Solution {
    public int maxDifference(String s) {
        int [] count = new int[26];

        for(char ch:s.toCharArray()) {
            count[ch-'a']++;
        }
        int evenCount = Integer.MAX_VALUE;
        int oddCount = 0;

        for(int i=0; i<count.length; i++) {
            if(count[i]%2 !=0) {
                oddCount = Math.max(oddCount,count[i]);
            }
            else if(count[i]!=0) {
                evenCount = Math.min(evenCount,count[i]);
            }
        }

        return oddCount-evenCount;
    }
}