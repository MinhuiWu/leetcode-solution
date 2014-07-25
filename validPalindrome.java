 public class Solution {
     public boolean isPalindrome(String s) {
         if (s == null || s.length() == 0)  return true;
         s = s.toLowerCase();
         int low = 0;
         int high = s.length() - 1;
        
         while (low < high) {
             if (! Character.isDigit(s.charAt(low)) && ! Character.isLetter(s.charAt(low))) {
                 low++;
                 if (low >= s.length())  return true;
             } else if (! Character.isDigit(s.charAt(high)) && ! Character.isLetter(s.charAt(high))) {
                 high--;
                 if (high <= 0)  return true;
             } else if (s.charAt(low) != s.charAt(high)) {
                 return false;
             } else {
                 low++;
                 high--;
             }
         }
         return true;
        
     }
 }