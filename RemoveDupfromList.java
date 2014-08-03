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
        ListNode cur = head;
        ListNode runner = head.next;
        
        while (runner != null) {
            if (cur.val == runner.val) {
                cur.next = runner.next;
                runner = runner.next;
            } else {
                cur = runner;
                runner = runner.next;
            }
        }        
        return head;
    }
}