public class Solution {
    public List<List<Integer>> permuteUnique(int[] num) {
        List<List<Integer>> res = new ArrayList<>();
        if (num == null)  return null;
        List<Integer> level = new ArrayList<>();
        boolean[] visit = new boolean[num.length];
        Arrays.sort(num);
        dfs(res, level, num, visit);
        return res;
    }
    
    public void dfs(List<List<Integer>> res, List<Integer> level, int[] num, boolean[] visit) {
        if (level.size() == num.length) {
            res.add(new ArrayList(level));
            return;
        }
        
        for (int i = 0; i < num.length; i++) {
            if (visit[i] == false) {
                level.add(num[i]);
                visit[i] = true;
                dfs(res, level, num, visit);
                level.remove(level.size() - 1);
                visit[i] = false;
                
                while (i < num.length - 1 && num[i] == num[i + 1])  i++;
            }
        }
    }
}