public class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0')  return 0;
        
        int[] res = new int[s.length() + 1];
        res[0] = 1;
        res[1] = 1;
        
        for (int i = 2; i <= s.length(); i++) {
            int temp = Integer.parseInt(s.substring(i - 1, i));
            if (temp != 0)  res[i] = res[i - 1];
            
            if (s.charAt(i - 2) != '0') {
                temp = Integer.parseInt(s.substring(i - 2, i));
                if (temp > 0 && temp <= 26)  res[i] += res[i - 2];
            }
        }
        return res[s.length()];
    }
}