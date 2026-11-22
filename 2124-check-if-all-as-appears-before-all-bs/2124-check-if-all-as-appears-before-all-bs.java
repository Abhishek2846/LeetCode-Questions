class Solution {
    public boolean checkString(String s) {
        int m = s.indexOf('b');

        if(m == -1) return true;

        for(int i = m; i < s.length(); i++) {
            if(s.charAt(i) == 'a') {
                return false;
            }
        }

        return true;
    }
}