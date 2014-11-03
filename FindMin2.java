public class Solution {
    public int findMin(int[] num) {
        //if (num == null || num.length == 0)  return -1;
        return findHelper(num, 0, num.length - 1);
    }
    
    public int findHelper(int[] num, int start, int end) {
        if (start > end)  return num[0];
        if (start == end)  return num[start];
        int mid = start + (end - start) / 2;
        
        if (num[start] == num[mid] && num[mid] == num[end]) {
            int temp = start;
            for (int i = start + 1; i < end; i++) {
                if (num[i] < num[temp])  temp = i;
            }
            return num[temp];
        }
        
        if (mid < end && num[mid + 1] < num[mid])  return num[mid + 1];
        if (start < mid && num[mid] < num[mid - 1])  return num[mid];
        if (num[mid] <= num[end]) 
            return findHelper(num, start, mid - 1);
        return findHelper(num, mid + 1, end);
        
    }
}