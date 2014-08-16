public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rLen = obstacleGrid.length;
        int cLen = obstacleGrid[0].length;
        int[][] res = new int[rLen + 2][cLen + 2];
        
        for (int i = 0; i < rLen; i++) {
            for (int j = 0; j < cLen; j++) {
                res[i][j] = 0;
            }
        }
        
        res[rLen][cLen + 1] = 1;
        
        for (int i = rLen; i > 0; i--) {
            for (int j = cLen; j > 0; j--) {
                if (obstacleGrid[i - 1][j - 1] == 1) {
                    res[i][j] = 0;
                    continue;
                }
                res[i][j] = res[i][j + 1] + res[i + 1][j];
            }
        }
        return res[1][1];
     }
}