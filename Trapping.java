public class Solution {
    public int trap(int[] A) {
        if (A == null || A.length == 0)  return 0;
        int res = 0;
        int[] trap = new int[A.length];
        int max = 0;
        
        for (int i = 0; i < A.length; i++) {
            trap[i] = max;
            max = Math.max(max, A[i]);
        }
        
        max = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            trap[i] = Math.min(trap[i], max);
            max = Math.max(max, A[i]);
            res += trap[i] - A[i] > 0 ? trap[i] - A[i] : 0;
        }
        return res;
    }
}