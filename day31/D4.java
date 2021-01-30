package day31;

import java.util.Stack;

/**
 *  波兰数
 * */
public class D4 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int a = stack.pop();
                    stack.push(stack.pop() - a);
                    break;
                case "*":
                    int b = stack.pop();
                    stack.push(b * stack.pop());
                    break;
                case "/" :
                    int c = stack.pop();
                    stack.push(stack.pop() / c);
                    break;
                default :
                    stack.push(Integer.parseInt(tokens[i]));
                    break;
            }
        }
        int x = stack.pop();
        return x;
    }

}
