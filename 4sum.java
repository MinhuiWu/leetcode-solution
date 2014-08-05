public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (num == null || num.length < 4)  return res;
        Arrays.sort(num);
        
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        for (int i = 0; i < num.length - 3; i++) {
            for (int j = i + 1; j < num.length - 2; j++) {
                int four = num.length - 1;
                int thir = j + 1;
                while (thir < four) {
                    int sum = num[i] + num[j] + num[thir] + num[four];
                    List<Integer> list = new ArrayList<Integer>();
                    if (sum == target) {
                        list.add(num[i]);
                        list.add(num[j]);
                        list.add(num[thir]);
                        list.add(num[four]);
                    
                        if (!set.contains(list)) {
                        set.add(list);
                        res.add(list);
                        }
                    
                        thir++;
                        four--;
                    } else if (sum < target) {
                        thir++;
                    } else {
                        four--;
                    }
                }
            }
        }
        return res;
    }
}