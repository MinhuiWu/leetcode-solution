public class Solution {
    public void solveSudoku(char[][] board) {
        List<Integer> empty = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    empty.add(i * 9 + j);
                }
            }
        }
        int len = empty.size();
        dfs(board, empty, 0, len);
    }
    
    public boolean dfs(char[][] board, List<Integer> empty, int cur, int len) {
        if (cur == len)  return true;
        int row = empty.get(cur) / 9;
        int col = empty.get(cur) % 9;
        for (int value = 1; value < 10; value++) {
            if (isValid(row, col, value, board)) {
                board[row][col] = (char)(value + '0');
                if (dfs(board, empty, cur + 1, len)) {
                    return true;
                } else {
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }
    
    
    public boolean isValid(int row, int col, int value, char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] - '0' == value)  return false;
            if (board[i][col] - '0'== value)  return false;
            int rowCube = 3 * (row / 3) + i / 3;
            int colCube = 3 * (col / 3) + i % 3;
            if (board[rowCube][colCube] - '0' == value)  return false;
        }
        return true;
    }
}