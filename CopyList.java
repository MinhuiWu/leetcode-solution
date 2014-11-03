/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null)  return head;
        RandomListNode newHead = new RandomListNode(head.label);
        RandomListNode node = newHead;
        RandomListNode cur = head;
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        map.put(head, newHead);
        
        while (cur.next != null) {
            RandomListNode newNode = new RandomListNode(cur.next.label);
            node.next = newNode;
            map.put(cur.next, newNode);
            node = newNode;
            cur = cur.next;
        }
        
        RandomListNode temp = head;
        RandomListNode copy = newHead;
        while (temp != null) {
            copy.random = map.get(temp.random);
            copy = copy.next;
            temp = temp.next;
        }
        
        return newHead;
    }
}