/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    TreeNode pre = null;
    TreeNode first = null;
    TreeNode second = null;
    
    public void find(TreeNode root) {
        if (root == null) return;
        find(root.left);
        
        if (pre == null) {
            pre = root;
        } else {
            if (pre.val > root.val) {
                if (first == null) {
                    first = pre;
                    second = root;
                } else {
                    second = root;
                }
            }
            pre = root;
        } 
        find(root.right);
    }
    
    
    public void swap(TreeNode nodeO, TreeNode nodeP) {
        int temp = nodeO.val;
        nodeO.val = nodeP.val;
        nodeP.val = temp;
    }
    
    public void recoverTree(TreeNode root) {
        find(root);
        swap(first, second);
    }
    
}