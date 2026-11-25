//The idea behind this approach is that if a string s can be constructed by repeating a substring, then concatenating two copies of s together and removing the first and last character would still contain s as a substring.
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String sub = doubled.substring(1, doubled.length() - 1);
        return sub.contains(s);
    }
}