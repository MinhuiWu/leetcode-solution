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
    public int sumNumbers(TreeNode root) {
        if (root == null)  return 0;
        return sumHelper(root, 0);
    }
    public int sumHelper(TreeNode root, int sum) {
        if (root == null)  return 0;
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null)  return sum;
        return sumHelper(root.left, sum) + sumHelper(root.right, sum);
        
    }
}