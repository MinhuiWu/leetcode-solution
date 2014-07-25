public class Solution {
    public List<String> anagrams(String[] strs) {
        LinkedList<String> res = new LinkedList<String>();
        if (strs == null || strs.length == 0)  return res;
        
        Map<String, LinkedList<String>> map = new HashMap<String, LinkedList<String>>();
        
        for (int i = 0; i < strs.length; i++) {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String key = new String(charArr);
            
            /* another way to do it 
            if (!map.containsKey(key)) {
                map.put(key, new LinkedList<String>());
                map.get(key).add(strs[i]);
                -----
                lst.add(strs[i]);
                map.put(key, lst);
            } else {
                map.get(key).add(strs[i]);
            }
            */
            
            if (!map.containsKey(key)) {
                map.put(key, new LinkedList<String>());
            }
            map.get(key).add(strs[i]);
            
        }
        
        for (LinkedList<String> temp : map.values()) {
            if (temp.size() > 1) {
                res.addAll(temp);
            }
        }
        return res;
    }
}