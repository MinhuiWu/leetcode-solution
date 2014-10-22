public class Solution {
    public String countAndSay(int n) {
        if (n < 1)  return "";
        String s = "1";
        
        for (int i = 0; i < n - 1; i++) {
            int cnt = 1;
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(j - 1)) {
                    cnt++;
                } else {
                    sb.append(cnt).append(s.charAt(j - 1));
                    cnt = 1;
                }
            }
            sb.append(cnt).append(s.charAt(s.length() - 1));
            s = sb.toString();
        }
        return s;
    }
}