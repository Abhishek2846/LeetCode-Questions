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
    public ListNode partition(ListNode head, int x) {
        
        // be seperate list banavi ek x ni value karta ochi hoi e ane x ni value karta vadhare hoi e
        ListNode left = new ListNode(0); //less than x vadi list 
        ListNode right = new ListNode(0); //greater than x vadi list

        ListNode leftEnd = left; //endpoint define kaira
        ListNode rightEnd = right;

        while(head != null){
            if(head.val < x){
                leftEnd.next = head;
                leftEnd = leftEnd.next;
            }
            else{
                rightEnd.next = head;
                rightEnd = rightEnd.next;
            }
            head = head.next;
        }

        // bei list ne merge kari didhi
        leftEnd.next = right.next;
        rightEnd.next = null;

        return left.next;

    }
}