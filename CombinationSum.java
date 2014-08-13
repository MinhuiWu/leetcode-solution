public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null)  return res;
        List<Integer> level = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, level, res, 0);
        return res;
    }
    
    public void dfs(int[] candidates, int target, List<Integer> level, List<List<Integer>> res, int pos) {
        if (target < 0)  return;
        if (target == 0) {
            res.add(new ArrayList(level));
            return;
        }
        
        for (int i = pos; i < candidates.length; i++) {
            level.add(candidates[i]);
            dfs(candidates, target - candidates[i], level, res, i);
            level.remove(level.size() - 1);
        }
    }
}