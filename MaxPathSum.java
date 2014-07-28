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
    int maxSum;
    public int maxPathSum(TreeNode root) {
        if (root == null)  return 0;
        maxSum = root.val;
        sumHelper(root);
        return maxSum;
    }
    
    public int sumHelper(TreeNode root) {
        if (root == null)  return 0;
        int left = Math.max(sumHelper(root.left), 0);
        int right = Math.max(sumHelper(root.right), 0);
        maxSum = Math.max(maxSum, root.val + left + right);
        return root.val + Math.max(left, right);
    }
}