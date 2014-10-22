public class Solution {
    public int[] searchRange(int[] A, int target) {
        int[] res = {-1, -1};
        int start = 0;
        int end = A.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (A[mid] < target)
                start = mid + 1;
            else
                end = mid;
        }
        

        if (A[start] != target) {
            return res;
        } else {
            res[0] = start;
        }
            
        start = 0;
        end = A.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (A[mid] < target + 1)
                start = mid + 1;
            else
                end = mid;
        }
        res[1] = A[start] == target ? start : start - 1;
        

        return res;
    
    }
}