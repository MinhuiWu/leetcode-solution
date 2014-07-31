public class Solution {
    public int threeSumClosest(int[] num, int target) {
        if (num == null || num.length == 0)  return 0;
        if (num.length == 1)  return num[0];
        if (num.length == 2)  return num[0] + num[1];
        Arrays.sort(num);
        int minDiff = Integer.MAX_VALUE;
        int result = 0;
        
        for (int i = 0; i < num.length - 2; i++) {
            int second = i + 1;
            int high = num.length - 1;
            
            while (second < high) {
                int total = num[i] + num[second] + num[high];
                int diff = Math.abs(total - target);
                if (diff == 0) {
                    return target;
                } else if (minDiff > diff) {
                    minDiff = diff;
                    result = total;
                } else if (total > target) {
                    high--;
                } else {
                    second++;
                }
            }
        }
        return result;
    }
}