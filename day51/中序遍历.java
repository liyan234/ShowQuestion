package day51;

import java.util.ArrayList;
import java.util.Stack;

public class 中序遍历 {

    // 非递归中序遍历 二叉树
    // 左中右
    static ArrayList<Integer> list  = new ArrayList<>();
    public static void midOrder(TreeNode root){
        if (root == null) {
            return;
        }
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();

        while (!stack.isEmpty() || node != null ) {
            //直到左子树为空
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            // 然后出栈
            node = stack.pop();
            list.add(node.val);

            if (node.right != null) {
                node = node.right;
            } else {
                node = null;
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

        midOrder(root);
        System.out.println(list);
    }

}
