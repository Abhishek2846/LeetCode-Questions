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
    public ListNode insertionSortList(ListNode head) {
        // if (head == null || head.next == null) {
        //     return head;
        // }
            
        // ListNode dummy = new ListNode(0); 
        // ListNode prev = dummy;             
        // ListNode curr = head;              
        // ListNode next = null;              

        // while (curr != null) {
        //     next = curr.next;
            
        //     while (prev.next != null && prev.next.val < curr.val) {
        //         prev = prev.next;
        //     }
        //     curr.next = prev.next;
        //     prev.next = curr;
            
        //     prev = dummy;
        //     curr = next;
        // }
        
        // return dummy.next;

        //aakhi linked list ne array list ma convert kari ne ene sort maravi didhi ane pchi ene pachi linked list ma change kari nakhi better way but not the insertion sort

         List<Integer> al= new ArrayList<>();
        while(head!=null){
            al.add(head.val);
            head=head.next;
        }
        Collections.sort(al);
        ListNode temp=new ListNode();
        ListNode me=temp;
        for(int i=0;i<al.size();i++){
            ListNode t= new ListNode(al.get(i));
            temp.next=t;
            temp=temp.next;
        }
        return me.next;
    }
}