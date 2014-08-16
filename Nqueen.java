public class Solution {
    public List<String[]> solveNQueens(int n) {
        List<String[]> res = new ArrayList<>();
        if (n <= 0)  return res;
        int[] col = new int[n];
        dfs(n, col, 0, res);
        return res;
    }
    
    
    public void dfs(int n, int[] col, int row, List<String[]> res) {
        if (row == n) {
            printBoard(res, col, n);
        } else {
             for (int i = 0; i < n; i++) {
                col[row] = i;
                if (isValid(col, row)) {
                    dfs(n, col, row + 1, res);
                }
            }
        }
        
    }
    
    
    public boolean isValid(int[] col, int row) {
        for (int i = 0; i < row; i++) {
            if (col[row] == col[i] || Math.abs(col[row] - col[i]) == (row - i)) {
                return false;
            }
        }
        return true;
    }
    
    
    public void printBoard(List<String[]> res, int[] col, int n) {
        
        String[] level = new String[n];
        for (int i = 0; i < n; i++) {
            String put = new String();
            for (int j = 0; j < n; j++) {
                if (col[i] == j)  put += 'Q';
                else put += '.';
            }
            level[i] = put;
        }
        res.add(level);
    }
}