class Solution {
    public int minAddToMakeValid(String s) {
        int oCount = 0, add = 0;
// If the character is (, increase oCount.
// If it is ):
    // If open > 0, match it with an existing ( and decrease oCount.
    // Otherwise, no ( is available, so add one insertion to add.
        for (char c : s.toCharArray()) {
            if (c == '(') {
                oCount++;
            } else {
                if (oCount > 0) {
                    oCount--;
                } else {
                    add++;
                }
            }
        }

// Any remaining open values are unmatched (.
// Each one needs a ), so return add + oCount.

        return add + oCount;
    }
}