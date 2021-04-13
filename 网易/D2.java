package 网易;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
}

public class D2 {

    public int maxMoney (TreeNode root) {
        // write code here

        if (root == null) {
            return 0;
        }
        Stack<TreeNode> stack = new Stack();
        TreeNode node = root;
        int count = 0;
        while (!stack.isEmpty() || node != null ) {
            //直到左子树为空
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            // 然后出栈
            stack.pop();
            node = stack.pop();
            if (node.right != null) {
                node = node.right;
                count += 5;
            } else {
                node = null;
                count += 2;
            }
        }
        return count;
    }
}
