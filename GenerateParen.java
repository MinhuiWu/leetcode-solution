public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n <= 0)  return res;
        dfs(res,"", n, n);
        return res;
    }
    
    public void dfs(List<String> res, String str, int left, int right) {
        if (left == 0 && right == 0) {
            res.add(str);
            return;
        }  
        
        if (left > 0) dfs(res, str + '(', left - 1, right);
        if (left < right) dfs(res, str + ')', left, right - 1);
    }
}