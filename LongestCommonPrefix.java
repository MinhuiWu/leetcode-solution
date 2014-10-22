public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)  return "";
        
        String str = strs[0];
        if (strs.length == 1)  return str;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == i || strs[j].charAt(i) != temp) {
                    return str.substring(0, i);
                } 
            }
        }
        return str;
    }
}