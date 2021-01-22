package day23;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
public class D2 {

    public boolean isBalance(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = height(root.left);
        int right = height(root.right);

        if (left < right) {
            int tmp = left;
            left = right;
            right = tmp;
        }
        return ((left - right) <= 1) && isBalance(root.left) && isBalance(root.right);
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
