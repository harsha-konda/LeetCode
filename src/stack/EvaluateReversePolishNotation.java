package stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        String op = null;
        for (String s : tokens) {
            try {
                int temp = Integer.parseInt(s);
                stack.push(temp);
            } catch (Exception ex) {
                int a = stack.pop();
                int b = stack.pop();

                if (s.equals("*")) stack.push(a * b);
                if (s.equals("+")) stack.push(a + b);
                if (s.equals("-")) stack.push(b - a);
                if (s.equals("/")) stack.push(b / a);


            }
        }

        return (stack.pop());
    }
}
