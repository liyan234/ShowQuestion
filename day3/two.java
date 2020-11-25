package day3;

import java.util.*;

class Parenthesis {
    public boolean chkParenthesis(String A, int n) {

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        // write code here
        Stack<Character> stack = new Stack<>();
        for (int i = n-1; i >= 0; i--) {

            char ch = A.charAt(i);

            if (map.containsKey(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char x = stack.pop();

                if (map.get(x) == ch) {

                } else {
                    return false;
                }
            }
        }
        return true;
    }
}