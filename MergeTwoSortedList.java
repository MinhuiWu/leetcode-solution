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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode cur = result;
        if (l1 == null && l2 == null)  return null;
        if (l1 == null)  return l2;
        if (l2 == null)  return l1;
        
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        
        if (l1 == null && l2 != null) {
            cur.next = l2;
            l2 = l2.next;
        } else if (l2 == null && l1 != null) {
            cur.next = l1;
            l1 = l1.next;
        }
        
    return result.next;    
    }
}