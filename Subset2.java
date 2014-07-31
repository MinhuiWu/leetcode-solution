public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] num) {
       /** 
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> level = new ArrayList<Integer>();
        Arrays.sort(num);
        res.add(level);
        dfs(res, level, 0, num);
        return res;
    }
    
    public void dfs(List<List<Integer>> res, List<Integer> level, int pos, int[] num) {
        if (pos == num.length) {
            res.add(new ArrayList<Integer>(level));
            return;
        }
        for (int i = pos; i < num.length; i++) {
            level.add(num[i]);
            res.add(new ArrayList<Integer>(level));
            dfs(res, level, pos + 1, num);
            level.remove(level.size() - 1);
            while(i<num.length-1 && num[i]==num[i+1]) i++; 
        }
    }
    */
 
    
       Arrays.sort(num);
       List<List<Integer>> res = new ArrayList<>();
       List<List<Integer>> pre = new ArrayList<>();
       pre.add(new ArrayList<Integer>());
       res.addAll(pre);
       
       for (int i = 0; i < num.length; i++) {
           List<List<Integer>> ones = new ArrayList<>();
           for (List<Integer> set : ((i > 0 && num[i] == num[i - 1]) ? pre : res)) {
               List<Integer> one = new ArrayList<Integer>();
               one.addAll(set);
               one.add(num[i]);
               ones.add(one);
           }
           pre.clear();
           pre.addAll(ones);
           res.addAll(pre);
       }
       return res;
    }
}