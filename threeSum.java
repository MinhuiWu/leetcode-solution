public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (num.length < 3 || num == null)  return result;
        
        Arrays.sort(num);
        
        HashSet<List<Integer>> set = new HashSet<List<Integer>>();
        for (int i = 0; i < num.length - 2; i++) {
            int target = -num[i];
            int low = i + 1;
            int high = num.length - 1;
            while (low < high) {
                if (num[low] + num[high] == target) {
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(-target);
                    list.add(num[low]);
                    list.add(num[high]);
                    if (set.add(list))  result.add(list);
                    low++;
                    high--;
                } else if (num[low] + num[high] > target) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return result;
    }
}