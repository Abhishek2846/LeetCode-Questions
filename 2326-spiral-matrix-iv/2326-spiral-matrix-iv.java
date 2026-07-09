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
    public int[][] spiralMatrix(int m, int n, ListNode head) {

        int[][] matrix = new int[m][n];

        for(var row : matrix){
            Arrays.fill(row,-1);
        }

        int srow = 0 , scoll = 0;
        int erow = m-1 , ecoll = n-1;

        ListNode curr = head;

        while(srow <= erow && scoll <= ecoll ){

            // Top
            for(int i=scoll ; i<=ecoll && curr != null ; i++){
                matrix[srow][i] = curr.val;
                curr = curr.next;
            }

            // Right
            for(int i=srow+1 ; i<=erow && curr != null; i++){
                matrix[i][ecoll] = curr.val;
                curr = curr.next;
            }

            // Bottom
            for(int i=ecoll-1 ; i>=scoll && curr != null; i--){
                if(erow == srow){
                    break;
                }
                matrix[erow][i] = curr.val;
                curr = curr.next;
            }

            // Left
            for(int i=erow-1 ; i>=srow+1 && curr != null; i--){
                if(ecoll == scoll){
                    break;
                }
                matrix[i][scoll] = curr.val;
                curr = curr.next;
            }

            srow++;
            scoll++;
            ecoll--;
            erow--;

        }

        return matrix;
    }
}