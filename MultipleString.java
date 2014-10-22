public class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        if (num1 == null || num2 == null || len1 == 0 || len2 == 0)  return null;
        int[] res = new int[len1 + len2];
        
        for (int i = 0; i < len2; i++) {
            int a = num2.charAt(len2 - i - 1) - '0';
            int carry = 0;
            for (int j = 0; j < len1; j++) {
                int b = num1.charAt(len1 - j - 1) - '0';
                res[i + j] += a * b + carry;
                carry = res[i + j] / 10;
                res[i + j] %= 10;
            }
            res[i + len1] += carry;
        }
        
        StringBuilder sb = new StringBuilder();
        int i = res.length - 1;
        while (i > 0 && res[i] == 0) {
            i--;
        }
        while (i >= 0) {
            sb.append(res[i]);
            i--;
        }
        return sb.toString();
    }
}