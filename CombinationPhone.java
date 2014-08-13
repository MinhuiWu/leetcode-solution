public class Solution {
    public List<String> letterCombinations(String digits) {
        char[][] table = { {}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j','k','l'},
        {'m','n','o'}, {'p','q','r','s'}, {'t','u','v'}, {'w','x','y','z'}};  
        List<String> res = new ArrayList<>();
        //if (digits == null || digits.length() == 0)  return res;
        StringBuffer sb = new StringBuffer();
        dfs(digits, res, sb, table, 0);
        return res;
    }
    
    
    public void dfs(String digits, List<String> res, StringBuffer sb, char[][] table, int depth) {
        if (depth >= digits.length()) {
            res.add(sb.toString());
            return;
        }
        
        int index = digits.charAt(depth) - '0';
        for (int i = 0; i < table[index].length; i++) {
            sb.append(table[index][i]);
            dfs(digits, res, sb, table, depth + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}