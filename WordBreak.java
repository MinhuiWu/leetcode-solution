public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        if (s == null || s.length() == 0)  return true;
        
        boolean[] res = new boolean[s.length() + 1];
        res[0] = true;
        for (int i = 0; i < s.length(); i++) {
            if (! res[i])  continue;
            for (String str : dict) {
                int cnt = i + str.length();
                if (cnt > s.length())  continue;
                
                String temp = s.substring(i, cnt);
                if (temp.equals(str))  res[cnt] = true;
            }
        }
        return res[s.length()];
    }
}