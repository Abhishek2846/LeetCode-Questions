class Solution {
    public long sumAndMultiply(int n) {
    //    StringBuilder sb = new StringBuilder();
    //     int sum = 0;
    //      while(n != 0){
    //     int digit = n%10;
    //     n /= 10;
    //     sum += digit;
    //     if(digit != 0){
    //         sb.append(""+digit);
    //     }
    //     }
    //     sb.reverse();
    //     if(sb.equals("")) {
    //         sb.append("0");
    //     }
    //     long x = Long.parseLong(sb.toString());

    //     return (long)sum * x;

    long num=0;
        long sum=0;
        long ans=0;
        while(n!=0){
            if(n%10!=0){
                num=num*10+n%10;
                sum+=n%10;
                
            }n/=10;
        }
         while(num!=0){
            ans=ans*10+num%10;
            num/=10;
        }
        return ans*sum;
    }
}