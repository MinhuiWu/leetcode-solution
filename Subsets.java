public class Solution {
    public List<List<Integer>> subsets(int[] S) {
        /*
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> level = new ArrayList<Integer>();
        Arrays.sort(S);
        res.add(level);
        dfs(res, level, 0, S);
        return res;
    }
    
    public void dfs(List<List<Integer>> res, List<Integer> level, int pos, int[] S) {
        for (int i = pos; i < S.length; i++) {
            level.add(S[i]);
            res.add(new ArrayList<Integer>(level));
            dfs(res, level, pos + 1, S);
            level.remove(level.size() - 1);
        }
    }
    */
    
    
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(S);
        
        for (int i = 0; i < S.length; i++) {
            List<List<Integer>> temp = new ArrayList<>();
           
            for (List<Integer> old : res) {
                temp.add(new ArrayList<Integer>(old));
            }
            
            for (List<Integer> now : temp) {
                now.add(S[i]);
            }
            
            List<Integer> single = new ArrayList<>();
            single.add(S[i]);
            temp.add(single);
            
            res.addAll(temp);
        }
        List<Integer> level = new ArrayList<>();
        res.add(level);
        return res;
    }
    
}