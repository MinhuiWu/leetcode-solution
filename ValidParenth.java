public class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) return true;
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (!stack.empty()) {
                    Character temp = stack.peek();
                    if (helper(temp, s.charAt(i))) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                } 
            }
        }
        return stack.empty();
    }
    
    
    public boolean helper(char char1, char char2) {
        if (char1 == '(' && char2 == ')' || char1 == '[' && char2 == ']' || char1 == '{' && char2 == '}') {
            return true;
        } else {
            return false;
        }
    }
    
}