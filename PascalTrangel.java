public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>  res = new ArrayList<>();
        if (numRows <= 0)  return res;
       
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> level = new ArrayList<>();
            level.add(1);
            if (i > 0) {
               for (int j = 0; j < res.get(i - 1).size() - 1; j++) {
                level.add(res.get(i - 1).get(j + 1) + res.get(i - 1).get(j));
               }
                level.add(1);
            }
            res.add(level);
        }
        return res;
    }
}