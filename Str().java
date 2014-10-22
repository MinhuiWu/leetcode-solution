public class Solution {
    public String strStr(String haystack, String needle) {
        int lenA = haystack.length();
        int lenB = needle.length();
        if (lenA == 0 && lenA == lenB)  return "";
        if (lenB == 0)  return haystack;
        
        int j = 0;
        
        for (int i = 0; i <= lenA - lenB; i++) {
            j = 0;
            while (j <= lenB && haystack.charAt(j + i) == needle.charAt(j)) {
                j++;
                if (j == lenB)  return haystack.substring(i);
            }
        } 
        return null;
    }
}