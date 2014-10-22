public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        if (rowIndex < 0)  return res; 
        res.add(1);
        
        for (int j = 0; j < rowIndex; j++) {
            for (int i = res.size() - 2; i >=0; i--) {
                res.set(i + 1, res.get(i) + res.get(i + 1));
            } 
            res.add(1);
        }
        return res; 
    }
}