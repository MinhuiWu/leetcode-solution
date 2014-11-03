public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        if (s == null || s.length() == 0)  return res;
        List<String> level = new ArrayList<>();
        dfs(res, level, s, 0);
        return res;
    }
    
    public void dfs(List<List<String>> res, List<String> level, String str, int pos) {
        if (str.length() == pos) {
            res.add(new ArrayList<String>(level));
            return;
        }
        
        for (int i = pos + 1; i <= str.length(); i++) {
            String temp = str.substring(pos, i);
            if (isPalindrome(temp)) {
                level.add(temp);
                dfs(res, level, str, i);
                level.remove(level.size() - 1);
            } 
        }
    }
    
    public boolean isPalindrome(String str) {
        if (str == null || str.length() == 0)  return true;
        int beg = 0;
        int end = str.length() - 1;
        while (beg < end) {
            if (str.charAt(beg) != str.charAt(end))  return false;
            beg++;
            end--;
        }
        return true;
    }
    
}