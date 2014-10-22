public class Solution {
    public int ladderLength(String start, String end, Set<String> dict) {
        if (start == null || end == null || start.length() == 0 
            || end.length() == 0 || start.length() != end.length())  return 0;
        
        int res = 1;    
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        dict.remove(start);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                String cur = queue.poll();
                for (int j = 0; j < cur.length(); j++) {
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == cur.charAt(j))  continue;
                        
                        String temp = replace(cur, j, c);
                        if (temp.equals(end)) {
                            return res + 1;
                        }
                        if (dict.contains(temp)) {
                            queue.offer(temp);
                            dict.remove(temp);
                        }
                    }
                }
            }
            res++;
        }
        return 0;
    }
    
    public String replace(String cur, int i, char c) {
        char[] chars = cur.toCharArray();
		chars[i] = c;
		return new String(chars);
    }
}