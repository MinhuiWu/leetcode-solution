public class Solution {
    public int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0)  return 0;
        int len = ratings.length;
        int res = len;
        int[] candy = new int[len];
    
        for (int i = 1; i < len; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            } else {
                candy[i] = 0;
            }
        }
        
        int max = 0;
        for (int i = len - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                max++;
            } else {
                max = 0;
            }
            candy[i] = Math.max(candy[i], max);
            res += candy[i];
        }
        res += candy[len - 1];
        
        return res;
    }
}