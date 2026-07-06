class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        // Sort by start ascending, end descending
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) return Integer.compare(b[1], a[1]);
            return Integer.compare(a[0], b[0]);
        });

        int count = 0;
        int prevStart = intervals[0][0];
        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            // If current interval is covered by previous
            if (prevStart <= start && prevEnd >= end) {
                count++;
            } else {
                // Update previous interval
                prevStart = start;
                prevEnd = end;
            }
        }

        return intervals.length - count;
    }
}