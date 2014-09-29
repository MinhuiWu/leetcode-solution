public class Solution {
    public int longestConsecutive(int[] num) {
        int max = 0;
        if (num == null || num.length == 0)  return max;
        HashSet set = new HashSet();
        
        for (int i : num) {
            set.add(i);
        }
        
        for (int i : num) {
            int temp = i;
            set.remove(i);
            int res = 1;
            while (set.contains(temp + 1)) {
                set.remove(temp + 1);
                temp++;
                res++;
            }
            temp = i;
            while (set.contains(temp - 1)){
                set.remove(temp - 1);
                temp--;
                res++;
            }
            max = Math.max(max, res);
        }
        return max; 
    }
}