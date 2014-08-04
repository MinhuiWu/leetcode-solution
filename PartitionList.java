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
    public ListNode partition(ListNode head, int x) {
        if (head == null)  return head;
        ListNode small = new ListNode(-1);
        ListNode big = new ListNode(-1);
        ListNode smaTemp = small;
        ListNode bigTemp = big;
        ListNode cur = head;
        
        while (cur != null) {
            if (cur.val < x) {
                smaTemp.next = cur;
                smaTemp = smaTemp.next;
            } else {
                bigTemp.next = cur;
                bigTemp = bigTemp.next;
            }
            cur = cur.next;
        }
        
        smaTemp.next = big.next;
        bigTemp.next = null;
        return small.next;
    }
}