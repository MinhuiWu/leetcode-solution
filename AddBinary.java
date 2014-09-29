public class Solution {
    public String addBinary(String a, String b) {
        if (a == null || a.length() == 0)  return b;
        if (b == null || b.length() == 0)  return a;
        StringBuilder res = new StringBuilder();
        
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int carry = 0;
        
        while (aLen >= 0 && bLen >= 0) {
            int sum = (int)(a.charAt(aLen) - '0' + b.charAt(bLen) - '0') + carry; 
            carry = sum / 2;
            sum %= 2;
            res.append(sum);
            aLen--;
            bLen--;
        }
        
        while (aLen >= 0) {
            int sum = (int)(a.charAt(aLen) - '0') + carry;
            carry = sum /2;
            sum %= 2;
            res.append(sum);
            aLen--;
        }
        
        while (bLen >= 0){
            int sum = (int)(b.charAt(bLen) - '0') + carry;
            carry = sum / 2;
            sum %= 2;
            res.append(sum);
            bLen--;
        }
        
        if (carry > 0) {
            res.append(carry);
        }
        
        return res.reverse().toString();
    }
}