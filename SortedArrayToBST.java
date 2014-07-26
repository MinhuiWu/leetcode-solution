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
    public TreeNode sortedArrayToBST(int[] num) {
        if (num == null || num.length == 0)  return null;
        return sortedHelper(num, 0, num.length - 1);
    }
    
    public TreeNode sortedHelper(int[] num, int low, int high) {
        if (low > high)  return null;
        int mid = low + (high - low) / 2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = sortedHelper(num, low, mid - 1);
        root.right = sortedHelper(num, mid + 1, high);
        return root;
    }
}