public class Solution {
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (num == null)  return res;
        List<Integer> level = new ArrayList<>();
        Arrays.sort(num);
        dfs(res, level, num, target, 0);
        return res;
    }
    
    public void dfs(List<List<Integer>> res, List<Integer> level, int[] num, int target, int pos) {
        if (target < 0)  return;
        if (target == 0) {
            res.add(new ArrayList<Integer>(level));
            return;
        }
        
        for (int i = pos; i < num.length; i++) {
            level.add(num[i]);
            dfs(res, level, num, target - num[i], i + 1);
            level.remove(level.size() - 1);
            
            while (i < num.length - 1 && num[i] == num[i + 1])  i++;
        }
    }
}