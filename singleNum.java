public class Solution {
    public int singleNumber(int[] A) {
        int sum = 0;
        for (int a : A) {
            sum ^= a;
        }
        return sum;
    }
} 