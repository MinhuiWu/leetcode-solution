public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        
        for (int i = digits.length - 1; i >= 0; i--) {
            int temp = digits[i] + carry;
            digits[i] = temp % 10;
            carry = temp / 10;
        }
        
        if (carry != 0) {
            int[] res = new int[digits.length + 1];
            for (int i = digits.length; i > 0; i--) {
                res[i] = digits[i - 1]; 
            } 
            res[0] = 1;
            digits = res;
        }
        return digits;
    }
}