public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas == null || gas.length == 0 || cost.length != gas.length)  return -1;
        
        int total = 0;
        int level = 0;
        int res = 0;
        for (int i = 0; i < gas.length; i++) {
            level += gas[i] - cost[i];
            total += level;
            if (level < 0) {
                res = i + 1;
                level = 0;
            }
        }
        
        if (total < 0)  return -1;
        return res;
    }
}