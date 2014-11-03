public class Solution {
    public List<Integer> findSubstring(String S, String[] L) {
        List<Integer> res = new ArrayList<>();
        if (L == null || L.length == 0)  return res;
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String str : L) {
            if (! map.containsKey(str)) {
                map.put(str, 1);
            } else {
                map.put(str, map.get(str) + 1); 
            }
        }
        
        for (int i = 0; i <= S.length() - L.length * L[0].length(); i++) {
            HashMap<String, Integer> check = new HashMap<>(map);
            for (int j = i; j <= S.length() - L[0].length() && ! check.isEmpty(); j += L[0].length()) {
                String sub = S.substring(j, j + L[0].length());
                if (! check.containsKey(sub))  break;
                
                if (check.get(sub) > 1) {
                    check.put(sub, check.get(sub) - 1);
                } else {
                    check.remove(sub);
                }
            }
            
            if (check.isEmpty())  res.add(i);
        }
        
        return res;
    }
}