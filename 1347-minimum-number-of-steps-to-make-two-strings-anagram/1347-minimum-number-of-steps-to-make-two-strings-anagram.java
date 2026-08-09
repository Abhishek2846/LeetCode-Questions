public class Solution {
    public int minSteps(String s, String t) {
        int[] countS = new int[26];
        int[] countT = new int[26];

        for (char ch : s.toCharArray()) {
            countS[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            countT[ch - 'a']++;
        }

        int steps = 0;
        for (int i = 0; i < 26; i++) {
            steps += Math.abs(countS[i] - countT[i]);
        }

        //Return the total number of steps divided by 2 since each step involves changing one character, and we count each change twice.
        return steps / 2;  
    }
}