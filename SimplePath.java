public class Solution {
    public String simplifyPath(String path) {
        if (path == null || path.length() == 0)  return "";
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("/");
        
        for (String s : arr) {
            if (! s.equals(".") && ! s.isEmpty()) {
                if (s.equals("..")) {
                    if (! stack.isEmpty()) {
                        stack.pop();
                    }
                } else {
                    stack.push(s);
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while (! stack.isEmpty()) {
            sb.insert(0, stack.pop());
            sb.insert(0, "/");
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}