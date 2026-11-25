class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();

        boolean negative = num < 0;
        num = Math.abs(num);

        while(num!=0) {
            int rem = num%7;
            sb.append(rem);
            num/=7;
        }

        if (negative) {
            sb.append("-");
        }

        return sb.reverse().toString();
    }
}