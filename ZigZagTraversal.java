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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)  return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        Boolean flag = false;
        
        while (! queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            int count = 0;
            
            while (count < size) {
                TreeNode temp = queue.remove();
                level.add(temp.val);
                if (temp.left != null)  queue.add(temp.left);
                if (temp.right != null)  queue.add(temp.right);
                count++;
            }
            
            if (!flag) {
                res.add(level);
            } else {
                Collections.reverse(level);
                res.add(level);
            }
            flag = ! flag;
        }
        return res;
    }
}