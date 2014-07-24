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
    public boolean isValidBST(TreeNode root) {
        return helper(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    
    public boolean helper(TreeNode root, int max, int min) {
        if (root == null)  return true;
        if (root.val >= max || root.val <= min)  return false;
        
        if (!helper(root.left, root.val, min) || !helper(root.right, max, root.val) ){
            return false;
        }
        return true;
    }
}