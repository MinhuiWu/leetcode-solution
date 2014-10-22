public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0)  return res;
        int cLen = matrix[0].length - 1;
        int rLen = matrix.length - 1;
        int rStart = 0;
        int cStart = 0;
        
        while (rLen >= 0 && cLen >= 0) {
            for (int c = cStart; c <= cLen; c++) {
                res.add(matrix[rStart][c]);
            }
            if (++rStart > rLen)  break;
            
            for (int r = rStart; r <= rLen; r++) {
                res.add(matrix[r][cLen]);
            }
            if (--cLen < cStart)  break;
            
            for (int c = cLen; c >= cStart; c--) {
                res.add(matrix[rLen][c]);
            }
            if (--rLen < rStart)  break;
            
            for (int r = rLen; r >= rStart; r--) {
                res.add(matrix[r][cStart]);
            }
            if (++cStart > cLen)  break;
        }
        
        return res;
    }
}
