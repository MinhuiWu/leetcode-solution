public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> level = new ArrayList<>();
        dfs(n, k, level, res, 1);
        return res;
    }
    
    public void dfs(int n, int k, List<Integer> level, List<List<Integer>> res, int pos) {
        if (level.size() == k) {
            res.add(new ArrayList<Integer>(level));
            return;
        }
        
        for (int i = pos; i <= n; i++) {
            level.add(i);
            dfs(n, k, level, res, i + 1);
            level.remove(level.size() - 1);
        }
    }
}