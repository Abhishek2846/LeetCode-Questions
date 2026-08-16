// Logic : The player loses if the sum of all removed stones becomes divisible by 3.
// So, instead of considering the actual values, we only need to count how many stones belong to each remainder group.

class Solution {
    public boolean stoneGameIX(int[] stones) {
        int a = 0;
        int b = 0;
        int c = 0;

        // count the stones based on their remainder
        for (int x : stones) {
            if (x % 3 == 0) {
                a++;
            } else if (x % 3 == 1) {
                b++;
            } else {
                c++;
            }
        }

        // If the number of stones divisible by 3 is even, Alice wins if there is at least one stone with remainder 1 and at least one stone with remainder 2.
        if (a % 2 == 0) {
            return b > 0 && c > 0;
        }

        // When a is odd, the difference between the number of remainder 1 and remainder 2 stones matters.
        // Alice wins only when:
        // abs(b - c) > 2
        return Math.abs(b - c) > 2;
    }
}