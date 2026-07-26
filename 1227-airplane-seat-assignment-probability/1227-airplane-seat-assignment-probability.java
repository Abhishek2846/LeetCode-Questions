class Solution {
    public double nthPersonGetsNthSeat(int n) {

    //When n = 1, the first person takes their own seat → probability = 1.0.
    // For n > 1, every other scenario has a 50% chance that the last person gets their own seat — either the first passenger takes their own seat (everyone else sits correctly), or they take the last passenger’s seat.
    // Thus, the result converges to 0.5 for any n > 1.
        if(n == 1)
            return 1;
        
        return 0.5;
    }
}