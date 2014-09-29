public class Solution {
    public void rotate(int[][] matrix) {
        int level = matrix.length / 2;
        
        for (int c = 0; c < level; c++) {
            int start = c;
            int end = matrix.length - start - 1;
            for (int r = start; r < end; r++) {
                int offset = r - start;
                int top = matrix[start][r];
                matrix[start][r] = matrix[end - offset][start];
                matrix[end - offset][start] = matrix[end][end - offset];
                matrix[end][end - offset] = matrix[r][end];
                matrix[r][end] = top;
            }
        }
    }
}