public class Solution {
    public void sortColors(int[] A) {
        if (A == null || A.length < 2)  return;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 0);
        map.put(2, 0);
        
        for (int i = 0; i < A.length; i++) {
            int value = map.get(A[i]) + 1;
            map.put(A[i], value);
        } 
        
        for (int i = 0; i < map.get(0); i++) {
            A[i] = 0;
        }
        for (int i = map.get(0); i < map.get(1) + map.get(0); i++) {
            A[i] = 1;
        }
        for (int i = map.get(1) + map.get(0); i < A.length; i++) {
            A[i] = 2;
        }
    }
}