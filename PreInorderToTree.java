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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null)  return null;
        int inend = inorder.length;
        int preend = preorder.length;
        return buildHelper(preorder, 0, preend - 1, inorder, 0, inend - 1);
    }
    
    public TreeNode buildHelper(int[] preorder, int prestart, int preend, int[] inorder, int instart, int inend) {
        if (instart > inend || prestart > preend)  return null;
        
        int rootvalue = preorder[prestart];
        int rootindex = 0;
        for (int i = instart; i <= inend; i++) {
            if (rootvalue == inorder[i]) {
                rootindex = i;
                break;
            }
        }
        
        int len = rootindex - instart;
        TreeNode root = new TreeNode(rootvalue);
        root.left = buildHelper(preorder, prestart + 1, prestart + len, inorder, instart, rootindex - 1);
        root.right = buildHelper(preorder, prestart + len + 1, preend, inorder, rootindex + 1, inend);
        return root;
    }
}