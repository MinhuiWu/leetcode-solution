public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1 == null || s2 == null || s3 == null)  return false;
        if (s1.length() + s2.length() != s3.length())  return false;
        boolean[][] res = new boolean[s1.length() + 1][s2.length() + 1];
        res[0][0] = true;
        
        for (int i = 1; i <= s1.length(); i++) {
            if (s1.substring(0, i).equals(s3.substring(0, i)))  res[i][0] = true;
        }
        for (int j = 1; j <= s2.length(); j++) {
            if (s2.substring(0, j).equals(s3.substring(0, j)))  res[0][j] = true;
        }
        
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s3.charAt(i + j - 1) && res[i - 1][j]) {
                    res[i][j] = true;
                }
                if (s2.charAt(j - 1) == s3.charAt(i + j - 1) && res[i][j - 1]) {
                    res[i][j] = true;
                }
            }
        }
        
        return res[s1.length()][s2.length()];
    }
}