public class Solution {
    public void setZeroes(int[][] matrix) {
        if (matrix == null)  return;
        
        int rowLen = matrix.length;
        int coluLen = matrix[0].length;
        
        boolean[] row = new boolean[rowLen];
        boolean[] column = new boolean[coluLen];
        
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < coluLen; j++) {
                if (matrix[i][j] == 0) {
                   row[i] = true;
                   column[j] = true;
                }
            }
        }
        
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < coluLen; j++) {
                if (row[i] || column[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}