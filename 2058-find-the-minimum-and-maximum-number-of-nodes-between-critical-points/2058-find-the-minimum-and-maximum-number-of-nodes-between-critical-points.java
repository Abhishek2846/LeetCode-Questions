/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        if(head == null || head.next == null || head.next.next == null){
            return new int[]{-1,-1};
        }

        int minDis = -1;
        int maxDis = -1;
        
        ListNode curr = head.next;

        int firstCriticalIdx = 0;
        int prevCriticalIdx = 0;

        ListNode prev = head;

        int i = 1;

        while(curr.next != null){

            if((prev.val < curr.val && curr.val > curr.next.val) ||
                (prev.val > curr.val && curr.val < curr.next.val)){

                if(firstCriticalIdx == 0){
                    firstCriticalIdx = i;
                }

                if(prevCriticalIdx != 0){
                    if(minDis == -1){
                        minDis =  i - prevCriticalIdx;
                    }
                    else{
                        minDis = Math.min(minDis , i - prevCriticalIdx);
                    }                
                }
                prevCriticalIdx = i;
            }

            i++;
            prev = curr;
            curr = curr.next;
        }
        if(prevCriticalIdx != firstCriticalIdx){
            maxDis = prevCriticalIdx - firstCriticalIdx;
        }

        return new int[]{minDis , maxDis};
    }
}