package day17;

class TreeNode {
    public int val;
    TreeNode left;
    TreeNode right;
}
public class one {
    public static void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        if (root.right != null) {
            Mirror(root.right);
        }
        if (root.left != null) {
            Mirror(root.left);
        }
    }

}
