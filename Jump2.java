public class Solution {
    public int jump(int[] A) {
        if (A == null || A.length == 0)  return 0;
        int res = 0;
        int reach = 0;
        int temp = 0;
        
        for (int i = 0; i < A.length; i++) {
            while (i > temp) {
                res++;
                temp = reach;
            }
            reach = Math.max(reach, A[i] + i);
            
        }
        
        if (reach < A.length - 1)  return 0; 
            return res;
    }
}