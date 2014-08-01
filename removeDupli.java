public class Solution {
    public int removeDuplicates(int[] A) {
        int result = 1;
        if (A == null || A.length == 0)  return 0;
        if (A.length < 2)  return A.length;
        
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[result - 1]) {
                A[result++] = A[i];
            }
        }
        return result;
    }
}