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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null)  return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        
        while (!stack.empty() || cur != null) {
            if (cur!= null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                if (! stack.empty()) {
                    cur = stack.pop();
                    res.add(cur.val);
                }
                cur = cur.right;
            }
        } 
        return res;
    }
}