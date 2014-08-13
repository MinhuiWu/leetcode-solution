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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null)  return result;
        List<Integer> level = new ArrayList<Integer>();
        pathSumHelper(root, sum, result, level);
        return result;
    }
    
    public void pathSumHelper(TreeNode root, int sum, List<List<Integer>> result, List<Integer> level) {
        if (root == null)  return;
        level.add(root.val);
        sum -= root.val;
        
        if (root.left == null && root.right == null && sum == 0) {
            result.add(new ArrayList<Integer>(level));
        } else {
            pathSumHelper(root.left, sum, result, level);
            pathSumHelper(root.right, sum, result, level);    
        }
        level.remove(level.size() - 1);
    } 
}