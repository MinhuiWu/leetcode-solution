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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)  return null;
       
        ListNode result = new ListNode(-1);
        ListNode cur = result;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 == null ? 0: l1.val);
            int val2 = (l2 == null ? 0: l2.val);
            int sum = val1 + val2 + carry;
            cur.next = new ListNode(sum % 10);
            carry = sum / 10;
            l1 = (l1 == null ? l1 : l1.next);
            l2 = (l2 == null ? l2 : l2.next);
            
            cur = cur.next;
        }
        
        return result.next;
    }
} 