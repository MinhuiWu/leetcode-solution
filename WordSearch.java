public class Solution {
    public boolean exist(char[][] board, String word) {
        if (word == null || word.length() == 0)  return true;
        boolean[][] visit = new boolean[board.length][board[0].length];
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, i, j, visit, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    
    public boolean dfs(char[][] board, String word, int row, int col, boolean[][] visit, int count) {
        if (count == word.length())  return true;
        if (row >= board.length || col >= board[0].length || row < 0 || col < 0)  return false;
        if (visit[row][col])  return false;
        if (word.charAt(count) != board[row][col])  return false;
        visit[row][col] = true;
        boolean res = dfs(board, word, row - 1, col, visit, count + 1) ||
                    dfs(board, word, row, col - 1, visit, count + 1) ||
                    dfs(board, word, row + 1, col, visit, count + 1) ||
                    dfs(board, word, row, col + 1, visit, count + 1);
        visit[row][col] = false;
        return res;
    }
}