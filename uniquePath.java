public class Solution {
    //DP bottom up
    public int uniquePaths(int m, int n) {
        int[][] res = new int[m + 2][n + 2];
        
        for (int i = 0; i < m + 2; i++) {
            res[i][n + 1] = 0;
        }
        for (int i = 0; i < n + 2; i++) {
            res[m + 1][i] = 0;
        }
        res[m][n + 1] = 1;
        
        for (int i = m; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                res[i][j] = res[i + 1][j] + res[i][j + 1];
            }
        }
        return res[1][1];
    }
    
    
    //DP topdown
    
}