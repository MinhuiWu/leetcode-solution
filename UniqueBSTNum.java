public class Solution {
    public int numTrees(int n) {
        int[] count = new int[n + 1];
        count[0] = 1;
        count[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j <= i; j++) {
                count[i] += count[i - j] * count[j - 1]; 
            }
        }
        return count[n];
    }
}