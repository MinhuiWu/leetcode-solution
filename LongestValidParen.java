public class Solution {
    public int longestValidParentheses(String s) {
        if (s == null || s.length() == 0)  return 0;
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int pos = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (stack.isEmpty()) {
                    pos = i + 1;
                } else {
                    stack.pop();
                    max = stack.isEmpty() ? Math.max(max, i - pos + 1) : Math.max(max, i - stack.peek());
                }
            }
        }
        return max;
    }
}