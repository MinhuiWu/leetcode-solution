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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int inend = inorder.length - 1;
        int postend = postorder.length - 1;
        return buildHelper(inorder, 0, inend, postorder, 0, postend);
    }
    
    public TreeNode buildHelper(int[] inorder, int instart, int inend, int[] postorder, int poststart, int postend) {
        if (instart > inend || poststart > postend)  return null;
        int rootindex = 0;
        int rootval = postorder[postend];
        
        for (int i = instart; i <= inend; i++) {
            if (inorder[i] == rootval) {
                rootindex = i;
                break;
            }
        }
        
        int len = rootindex - instart;
        TreeNode root = new TreeNode(rootval);
        root.left = buildHelper(inorder, instart, rootindex - 1, postorder, poststart, poststart + len - 1);
        root.right = buildHelper(inorder, rootindex + 1, inend, postorder, poststart + len, postend - 1);
        return root;
    }
}