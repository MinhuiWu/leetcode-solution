/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)  return head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;
        slow = sortList(head);
        fast = sortList(fast);
        return merge(slow, fast);
    }
    
    public ListNode merge(ListNode slow, ListNode fast) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (slow != null && fast!= null) {
            if (slow.val < fast.val) {
                cur.next = slow;
                slow = slow.next;
            } else {
                cur.next = fast;
                fast = fast.next;
            }
            cur = cur.next;
        }
        
        if (slow != null)  cur.next = slow;
        if (fast != null)  cur.next = fast;
        return head.next;
    }
}