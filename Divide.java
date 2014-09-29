public class Solution {
    public int divide(int dividend, int divisor) {
        int res = 0;
        
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        
        while (a >= b) {
            int cnt = 0;
            while (a >= (b << cnt)) {
                cnt++;
            }
            res += 1 << (cnt - 1);
            a -= b << (cnt - 1);
        }
        
        if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0)  res = -res;
        return res;
    }
}