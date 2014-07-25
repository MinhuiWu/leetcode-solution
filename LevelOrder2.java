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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> restemp = new ArrayList<List<Integer>>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null)  return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            //TreeNode cur = queue.peek();
            List<Integer> list = new LinkedList<Integer>();
            int size = queue.size();
            int count = 0;
            while (count < size) {
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
                count++;
            }
            restemp.add(list);
        }
        
        //reverse the arraylist
        for (int i = restemp.size() - 1; i >= 0; i--) {
            res.add(restemp.get(i));
        }
        
        return res;
    }
}