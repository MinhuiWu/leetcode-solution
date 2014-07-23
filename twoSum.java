public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if (numbers.length < 2)  return result;
        HashMap<Integer,Integer> hashmap = new HashMap<Integer, Integer>();
        
        
        for (int i = 0; i< numbers.length; i++) {
            if (hashmap.containsKey(numbers[i])) {
                result[1] = i + 1;
                result[0] = hashmap.get(numbers[i]) + 1;
            } else {
                hashmap.put(target - numbers[i], i);
            }
        }
        
        return result;
    }
}