class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> a = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            a.add(stones[i]);
        }
        while (a.size() > 1) {
            int x = a.peek();
            a.poll();
            int y = a.peek();
            a.poll();
            if (x != y) a.add(x - y);
        }
        if (a.size() == 0) return 0;
        return a.peek();        
    }
}