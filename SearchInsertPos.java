public class Solution {
    public int searchInsert(int[] A, int target) {
        if (A == null || A.length == 0)  return 0;
        
        return searchHelper(0, A.length - 1, target, A);
    }
    
    public int searchHelper(int low, int high, int target, int[] A) {
        int mid = low  + (high - low) / 2;
        if (A[mid] == target)  return mid;
        if (A[mid] > target) {
            return low < mid ? searchHelper(0, mid - 1, target, A) : low;
        } else {
            return high > mid ?searchHelper(mid + 1, high, target, A) : high + 1;
        }
    }
}