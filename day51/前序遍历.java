package day51;

import java.util.ArrayList;
import java.util.Stack;

public class 前序遍历 {
    //中左右
    /** 1.先将根节点入栈
     2.访问根节点
     3.如果根节点存在右孩子，则将右孩子入栈
     4.如果根节点存在左孩子，则将左孩子入栈（注意：一定是右孩子先入栈，然后左孩子入栈）
     5.重复2-4
     */
    static ArrayList<Integer> list = new ArrayList<>();
    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        //中左右
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        stack.push(node);
        while (!stack.isEmpty()) {
            // 根据栈后进先出得道理
            node = stack.pop();
            list.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
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

        preOrder(root);
        System.out.println(list);
    }

}
