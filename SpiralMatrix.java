public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        if (n < 0)  return res;
        int num = 1;
        int level = n / 2 ;
        
        for (int i = 0; i < level; i++) {
            //top
            for (int j = i; j < n - i - 1; j++) {
                res[i][j] = num++;
            }
            //right
            for (int j = i ; j < n - i - 1; j++) {
                res[j][n - i - 1] = num++;
            }
            //bottom
            for (int j =  n - i - 1; j > i; j--) {
                res[n - i - 1][j] = num++;
            }
            //left
            for (int j = n - i - 1; j > i; j--) {
                res[j][i] = num++;
            }
        }
        
        if (n % 2 == 1) {
            res[level][level] = num;
        }
        
        return res;
    }
}