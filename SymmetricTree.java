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
    public boolean isSymmetric(TreeNode root) {
        if (root == null)  return true;
        return symmetricHelper(root.left, root.right);
    }
    
    public boolean symmetricHelper(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null)  return false;
        if (right.val != left.val)  return false;

        return symmetricHelper(left.right, right.left) && symmetricHelper(left.left, right.right);
    }
       
}