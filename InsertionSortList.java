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
    public ListNode insertionSortList(ListNode head) {
        if (head == null)  return head;
        ListNode dummy = new ListNode(0);
        //dummy.next = head;
        ListNode cur = head;
        ListNode pre = dummy;
        
        while (cur != null) {
            ListNode next = cur.next;
            pre = dummy;
            while (pre.next != null && pre.next.val <= cur.val) {
                pre = pre.next;
            }
            
            cur.next = pre.next;
            pre.next = cur;
            cur = next;
        }
        return dummy.next;
    }
}