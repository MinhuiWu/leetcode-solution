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
    public void flatten(TreeNode root) {
        if(root == null) return;
        flattenRecurse(root);
    }
 
    public TreeNode flattenRecurse(TreeNode root){
        if(root.left == null && root.right == null) return root;
        else if(root.left != null && root.right != null){
            TreeNode right = root.right;
            TreeNode leftEnd = flattenRecurse(root.left);
            root.right = root.left;
            leftEnd.right = right;
            root.left = null;
            return flattenRecurse(right);
        }
        else{
            root.right = root.right == null? root.left: root.right;
            root.left = null;
            return flattenRecurse(root.right);
        }
    }
}