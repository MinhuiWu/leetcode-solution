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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null)  return head;
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        int count = 1;
        while (count < m) {
            count++;
            cur = cur.next;
        }
        
        ListNode pre = cur;
        ListNode current = pre.next;
        
        for (int i = 0; i < n - m; i++) {
            ListNode next = current.next;
            current.next = next.next;
            next.next = pre.next;
            pre.next = next;
            next = current.next;
        }
    return dummy.next; 
    }
}