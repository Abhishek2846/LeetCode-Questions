class Solution {
    List<String> res = new ArrayList<>();
    public List<String> validStrings(int n) {
        appendAtEnd(n, 0, new String());
        return res;
    }

    void appendAtEnd(int n, int index, String str) {
        if (index == n) {
            res.add(str);
            return;
        }

        if (str.length() == 0 || str.charAt(str.length() - 1) == '1') {
            appendAtEnd(n, index + 1, str + "0");
        }

        appendAtEnd(n, index + 1, str + "1");

    }
}