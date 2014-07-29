public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][10];
        boolean[][] column = new boolean[9][10];
        boolean[][] cube = new boolean[9][10];
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                
                int num = (int)(board[i][j] - '0');
                if (row[i][num] == false) {
                    row[i][num] = true;
                } else {
                    return false;
                }
                
                if (column[j][num] == false) {
                    column[j][num] = true;
                } else {
                    return false;
                }
                
                int cubeIndex = i - i % 3 + j/3;
                if (cube[cubeIndex][num] == false) {
                    cube[cubeIndex][num] = true;
                } else {
                    return false;
                }
            }
        }
        
        return true;
    }
}