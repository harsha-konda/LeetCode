package strings;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {

        char[] sChar = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < sChar.length; i++) {
            if (sChar[i] == '{' || sChar[i] == '[' || sChar[i] == '(') {
                stack.push(sChar[i]);
            } else if (sChar[i] == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (sChar[i] == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }

            } else if (sChar[i] == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }

        }
        return stack.isEmpty();

    }


}
