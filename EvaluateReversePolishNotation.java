public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        if (tokens.length <=0  || tokens == null)  return -1;
        if (tokens.length == 1)  return Integer.valueOf(tokens[0]);
        if (tokens.length == 2)  return Integer.valueOf(tokens[2]);
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        
        for (int i = 0; i < tokens.length; i++) {
            if (!isOperator(tokens[i])) {
                stack.push(Integer.valueOf(tokens[i])); 
            } else if (!stack.empty()) {
                int a = stack.pop();
                int b = stack.pop();
                if (tokens[i].equals("+")) {
                    result = b + a;
                    stack.push(result);
                } else if (tokens[i].equals("-")) {
                    result = b - a;
                    stack.push(result);
                } else if (tokens[i].equals("*")) {
                    result = b * a;
                    stack.push(result);
                } else if (tokens[i].equals("/")) {
                    if (a == 0) {
                        return 0;
                    } else {
                        result = b / a;
                        stack.push(result);
                    }
                }
                
            }
        }
        int ans = stack.pop();
        return ans;
    }
    
    
    public boolean isOperator(String str) {
        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
            return true;
        } else {
            return false;
        }
    }
}
