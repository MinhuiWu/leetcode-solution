public class Solution {
    public String minWindow(String S, String T) {
        String res = "";
        if (T == null || S == null || S.length() == 0 || T.length() == 0)  return res;
        
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < T.length(); i++) {
            if (map.containsKey(T.charAt(i))) {
                map.put(T.charAt(i), map.get(T.charAt(i)) + 1); 
            } else {
                map.put(T.charAt(i), 1);    
            }
        }
        
        int cnt = 0;
        int index = 0;
        int minLen = S.length() + 1;
        for (int i = 0; i < S.length(); i++) {
            if (map.containsKey(S.charAt(i))) {
                map.put(S.charAt(i), map.get(S.charAt(i)) - 1);
                if (map.get(S.charAt(i)) >= 0)  cnt++;
            }
            while (cnt == T.length()) {
                if (map.containsKey(S.charAt(index))) {
                    map.put(S.charAt(index), map.get(S.charAt(index)) + 1);
                    
                    if (map.get(S.charAt(index)) > 0) {
                        if (minLen > i - index + 1) {
                            res = S.substring(index, i + 1);
                            minLen = i - index + 1;
                        }
                        cnt--;
                    }
                }
                index++;
            } 
        }
        return res;
    }
}