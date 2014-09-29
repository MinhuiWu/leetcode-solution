public class Solution {
    public int search(int[] A, int target) {
        if (A == null)  return -1;
        int low = 0;
        int high = A.length - 1;
        
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == A[mid])  return mid;
            if (A[low] <= A[mid]) {
                if (target < A[mid] && target >= A[low]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target <= A[high] && target > A[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}