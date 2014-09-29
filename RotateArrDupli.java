public class Solution {
    public boolean search(int[] A, int target) {
       if (A == null || A.length == 0)  return false;
        return searchHelper(A, target, 0, A.length - 1);
    }
    
    public boolean searchHelper(int[] A, int target, int low, int high) {
        int mid = low + (high - low) / 2;
        if (low > high)  return false; 
        if (A[mid] == target)  return true;
        
        if (A[low] < A[mid]) {
            if (A[mid] > target && A[low] <= target) {
                return searchHelper(A, target, low, mid - 1);
            } else {
                return searchHelper(A, target, mid + 1, high);
            }
        } else if (A[low] > A[mid]) {
            if (A[mid] < target && A[high] >= target) {
                return searchHelper(A, target, mid + 1, high);
            } else {
                return searchHelper(A, target, low, mid - 1);
            }
        } else {
            return searchHelper(A, target, low + 1, high);
        }
    }
}
 
        