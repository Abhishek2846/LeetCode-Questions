// class Solution {
//     public int mirrorDistance(int n) {
//         String str = String.valueOf(n);

//         String rev = new StringBuilder(str).reverse().toString();

//         int a = Integer.parseInt(rev);

//         return Math.abs(n - a);
//     }
// }

class Solution {
    private int rev(int n) {
        int a = 0;
        while(n > 0) {
            a = a * 10 + (n % 10);
            n /= 10;
        }
        return a;
    }
    public int mirrorDistance(int n) {
        int m = rev(n);
        return Math. abs(m - n);
    }
}