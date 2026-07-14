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
    public ListNode swapPairs(ListNode head) {
        // base case
        if (head==null||head.next==null) {
            return head;
        }

        // recursive case
        ListNode next=head.next;
        ListNode temp=next.next;
        head.next=temp;
        next.next=head;
        head.next=swapPairs(temp);
        return next;
    }
}