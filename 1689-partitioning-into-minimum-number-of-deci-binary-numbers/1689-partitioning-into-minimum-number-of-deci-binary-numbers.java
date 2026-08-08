class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(char ch:n.toCharArray()){
            int num=ch-'0';
            if(num>max){
                max=num;
            }
        }
        return max;
    }
}