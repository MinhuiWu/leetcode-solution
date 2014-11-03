public class Solution {
    public int numDistinct(String S, String T) {
        if (T == null || T.length() == 0)  return 0;
        int[][] res = new int[S.length() + 1][T.length() + 1];
        
        for (int i = 0; i < T.length(); i++) {
            res[0][i] = 0;
        }
        
        for (int j = 0; j < S.length(); j++) {
            res[j][0] = 1;
        }
        
        for (int i = 1; i <= S.length(); i++) {
            for (int j = 1; j <= T.length(); j++) {
                res[i][j] = res[i - 1][j];
                if (S.charAt(i - 1) == T.charAt(j - 1))  res[i][j] += res[i - 1][j - 1];
            }
        }
        return res[S.length()][T.length()];
    }
}