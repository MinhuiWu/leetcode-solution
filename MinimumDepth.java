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
    /* all is accepted code
    public int minDepth(TreeNode root) {
        if (root == null)  return 0;
        return minDepthHelper(root);
    }
    public int minDepthHelper(TreeNode node) {
        if (node == null)  return Integer.MAX_VALUE;
        if (node.left == null && node.right == null)  return 1;
        return Math.min(minDepthHelper(node.left), minDepthHelper(node.right)) + 1;
        
    }
    */
    public int minDepth(TreeNode root) {
        if (root == null)  return 0;
        
        if (root.left == null || root.right == null)  return Math.max(minDepth(root.left), minDepth(root.right)) + 1;
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}