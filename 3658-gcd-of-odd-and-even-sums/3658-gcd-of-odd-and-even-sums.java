class Solution {
    public int gcdOfOddEvenSums(int n) {
        // int oddSum = n*n;
        // int evenSum = n*(n+1);
        // int gcd = 1;
        // for(int i = 1 ; i < Math.max(oddSum , evenSum) ; i++){
        //     if(oddSum%i == 0 && evenSum%i == 0){
        //         gcd = i;
        //     }
        // }
        // return gcd;


        // gcd of the sum of the first n even and the first n odd number is always n because        
        // sumOdd = n * (1 + 2n-1) / 2 = n^2
        // sumEven = n* (2+2n)/2 = n(n+1)
        // we need gcd(sumOdd, sumEven) = gcd(n^2 , n(n+1))
        // which is n*gcd(n,n+1)
        // as two consecutive numbers are always co-prime, so gcd(n,n+1) = 1
        // so gcd(n^2 , n(n+1)) = n
        return n;
    }
}