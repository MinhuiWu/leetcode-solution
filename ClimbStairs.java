public class Solution {
    public int climbStairs(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        
        int[] result = new int[n + 1];
        if (n > 2) {
            result[1] = 1;
            result[2] = 2;
            for (int i = 3; i <= n ; i++) {
            result[i] = result[i - 2] + result[i - 1];
            }
        }
        return result[n];
    }
}