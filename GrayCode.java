public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        if (n < 0)  return res;
        //if (n == 0)  res.add(0);
        int count = 1 << n;
        for (int i = 0; i < count; i++) {
            res.add(i ^ (i >> 1));
        }
        return res;
    }
}