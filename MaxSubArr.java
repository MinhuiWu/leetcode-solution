public class Solution {
    public int maxSubArray(int[] A) {
        if (A == null || A.length == 0)  return 0;
        int res = 0;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < A.length; i++) {
            if (res < 0)  res = 0;
            res += A[i];
            max = Math.max(res, max);
        }
        return max;
    }
}