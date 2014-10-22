public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0)  return 0;
        int len = triangle.size() - 1;
        int[] sum = new int[len + 1];
        
        for (int i = 0; i < triangle.get(len).size(); i++) {
            sum[i] = triangle.get(len).get(i);
        }
        
        for (int i = len - 1; i >= 0; i--) {
            for (int layer = 0; layer < triangle.get(i + 1).size() - 1; layer++) {
                sum[layer] = triangle.get(i).get(layer) + Math.min(sum[layer], sum[layer + 1]);
            }
        }
        return sum[0];
    }
}