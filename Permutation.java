public class Solution {
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> res = new ArrayList<>();
        if (num == null)  return res;
        List<Integer> level = new ArrayList<Integer>();
        boolean[] visit = new boolean[num.length];
        Arrays.sort(num);
        dfs(res, num, level, visit);
        return res;
    }
    
    public void dfs(List<List<Integer>> res, int[] num, List<Integer> level, boolean[] visit) {
        if (level.size() == num.length) {
            res.add(new ArrayList(level));
            return;
        }
        
        for (int i = 0; i < num.length; i++) {
            if (visit[i] == false) {
                level.add(num[i]);
                visit[i] = true;
                dfs(res, num, level, visit);
                level.remove(level.size() - 1);
                visit[i] = false;
            }
        }
    }
}