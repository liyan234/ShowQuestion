package day5;

import java.util.Stack;

public class Solution {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    // 栈实现队列
    // 进入队列操作
    // 栈是先进后出
    // 队列是先进先出
    //  一定使用 stack.isEmpty()方法
    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
