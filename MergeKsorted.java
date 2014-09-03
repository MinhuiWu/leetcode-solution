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
    public ListNode mergeKLists(List<ListNode> lists) {
        if (lists == null || lists.size() == 0)  return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.size(), new Comparator<ListNode>(){
            public int compare(ListNode a, ListNode b) {
                if (a.val > b.val)  return 1;
                if (a.val == b.val)  return 0;
                else  return -1;
            }
        });
        
        for(ListNode list : lists) {
            if (list != null) {
                queue.add(list);
            }
        }
        
        ListNode head = new ListNode(0);
        ListNode prev = head;
        
        while (queue.size() > 0) {
            ListNode current = queue.poll();
            prev.next = current;
            
            if(current.next != null) {
                queue.add(current.next);
            }
            
            prev = prev.next;
        }
        
        return head.next;
    }
}