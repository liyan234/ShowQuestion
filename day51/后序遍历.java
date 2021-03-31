package day51;

import java.util.ArrayList;
import java.util.Stack;

public class 后序遍历 {


    /**
     * 1. 根节点入栈
     * 2. 左子树入栈
     * */
    static ArrayList<Integer> list = new ArrayList<>();
    public static void endOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        TreeNode pre = null;

        
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            if (!stack.isEmpty()) {
                 node = stack.peek();
                // 右子树为空 或者右子树被遍历过 添加当前结点
                if (node.right == null || node.right == pre) {
                     node = stack.pop();
                     list.add(node.val);
                     pre = node;
                     // 将 node 置为null 出栈上一个节点 // 或者遍历完毕
                     node = null;
                } else {
                    node = node.right;
                }
            }
        }
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode root1 = new TreeNode(2);
        TreeNode root2 = new TreeNode(3);
        TreeNode root3 = new TreeNode(4);
        TreeNode root4 = new TreeNode(5);
        TreeNode root5 = new TreeNode(6);

        root.left = root1;
        root.right = root2;
        root1.left = root3;
        root1.right = root4;
        root2.left = root5;

        endOrder(root);
        System.out.println(list);
    }

}
