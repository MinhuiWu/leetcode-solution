public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)  return false;
        
        //initialize how many zero
        int cnt = 1;
        while (x / cnt >= 10) {
            cnt *= 10;
        }
        
        while (x != 0) {
            int a = x % 10;
            int b = x / cnt;
            if (a != b)  return false;
            
            x = (x % cnt) / 10;
            cnt /= 100;
        }
        
        return true;
    }
}