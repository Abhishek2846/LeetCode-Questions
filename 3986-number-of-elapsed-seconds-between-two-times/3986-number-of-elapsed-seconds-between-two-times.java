class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int start = toSecond(startTime);
        int end = toSecond(endTime);

        return end-start;
    }

    public int toSecond(String time) {
        String [] arr = time.split(":");
        int hour = Integer.parseInt(arr[0]);
        int minute = Integer.parseInt(arr[1]);
        int second = Integer.parseInt(arr[2]);

        return (hour*3600)+(minute*60)+second;
    }
}