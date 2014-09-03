public class Solution {
    /* not deal with the overflow problem
    */
    public int reverse(int x) {
        boolean flag = true;
        int res = 0;
        if (x < 0) {
            x = -x;
            flag = false;
        } 
        
        while (x != 0) {
            int temp = x % 10;
            x /= 10;
            res = temp + res * 10;
        }
        
        if (!flag) {
            res = - res;
        }
        return res;
    }
}