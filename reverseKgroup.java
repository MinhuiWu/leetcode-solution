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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1)  return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        //ListNode cur = head;
        int length = 0;
        
        while (head != null) {
            length++;
            if (length % k == 0) {
                pre = reverse(pre, head.next);
                head = pre;
            }
            head = head.next;
        }
        return dummy.next;
    }
    
    public ListNode reverse(ListNode start, ListNode end) {
        ListNode cur1 = start.next;
        ListNode cur2 = cur1.next;
        while (cur2 != end) {
            cur1.next = cur2.next;
            cur2.next = start.next;
            start.next = cur2;
            cur2 = cur1.next;
        }
        return cur1;
    }
}