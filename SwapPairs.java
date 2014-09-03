/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null)  return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode pre = dummy;
        ListNode cur = head;
        ListNode next = cur.next;
        while (next != null) {
            pre.next = next;
            cur.next = next.next;
            next.next = cur;
            
            pre = cur;
            cur = cur.next;
            next = cur == null ? null : cur.next;
        }
        
        return dummy.next;
    }
}