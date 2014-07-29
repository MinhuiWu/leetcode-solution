public class Solution {
    int res;
    public int totalNQueens(int n) {
        res = 0;
        if (n <= 0)  return res;
        int[] column = new int[n];
        dfs(column, 0, n);
        return res;
    }
    
    public void dfs(int[] column, int row, int n) {
        if (row == n) {
            res += 1;  
            return;
        }
        for (int i = 0; i < n; i++) {
            column[row] = i;
            if (isValid(column, row))  dfs(column, row + 1, n);
        }
    }
    
    
    public boolean isValid(int[] column, int row) {
        for (int i = 0; i < row; i++) {
            if (column[i] == column[row] || Math.abs(column[i] - column[row]) == (row - i)) {
                return false;
            }
        }
        return true;
    }
}