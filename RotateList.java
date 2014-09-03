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
    public ListNode rotateRight(ListNode head, int n) {
        if (head == null || n == 0)  return head;
        ListNode slow = head;
        ListNode fast = head;
        
        while(n > 0) {
            fast = fast.next;
            n--;
            if (fast == null)  fast = head;
        }
        
        if (fast == null || slow == fast)   return head;
            
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;
        return newHead;
    }
}