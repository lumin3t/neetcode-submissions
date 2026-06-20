class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (int i=0; i<tokens.length; i++) {
            String token = tokens[i];
            switch(token) {
                case "+": stack.push(stack.pop() + stack.pop()); break;
                case "-": int a = stack.pop(), b = stack.pop(); stack.push(b-a); break;
                case "*": stack.push(stack.pop()*stack.pop()); break;
                case "/": int x = stack.pop(), y = stack.pop(); stack.push(y/x); break;
                default: stack.push(Integer.parseInt(token));
            }
        }   
        return stack.pop();
    }
}
