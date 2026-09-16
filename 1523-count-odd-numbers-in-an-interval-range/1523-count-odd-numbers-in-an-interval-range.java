class Solution {
    public int countOdds(int low, int high) {
        //basically what we did over here is we got the all odd number count from the 0 to high and then we simply subtracted the odd number count till the low -1.
        return (high + 1) / 2 - (low / 2);        
    }
}