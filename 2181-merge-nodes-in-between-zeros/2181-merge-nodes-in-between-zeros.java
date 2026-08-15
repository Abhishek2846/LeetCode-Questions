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
    public ListNode mergeNodes(ListNode head) {
        ListNode newLL = head.next;
        ListNode nextNode = newLL;

        while (nextNode != null) {
            int sum = 0;

            while (nextNode.val != 0) {
                sum += nextNode.val;
                nextNode = nextNode.next;
            }

            newLL.val = sum;
            nextNode = nextNode.next;
            newLL.next = nextNode;
            newLL = newLL.next;
        }
        return head.next;
    }
}