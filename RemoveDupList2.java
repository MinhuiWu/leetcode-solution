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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)  return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        ListNode runner = head;
        
        while (cur.next != null) {
            runner = cur.next;
            while (runner.next != null && runner.val == runner.next.val) {
                runner = runner.next;
            }
            if (cur.next != runner) {
                cur.next = runner.next;
            } else {
                cur = runner;
            }
        }
        return dummy.next;
    }
}