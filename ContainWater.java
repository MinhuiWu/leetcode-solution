public class Solution {
    public int maxArea(int[] height) {
         if (height == null || height.length == 0)  return 0;
         int start = 0;
         int end = height.length - 1;
         int res = Integer.MIN_VALUE;
         
         while (start < end) {
             int temp;
             if (height[start] < height[end]) {
                temp = height[start] * (end - start); 
                start++;
             } else {
                temp = height[end] * (end - start);
                end--;
             }
             if (temp > res)  res = temp;
         }

         return res;
    }
}