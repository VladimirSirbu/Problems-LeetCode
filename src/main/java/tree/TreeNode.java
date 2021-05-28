package tree;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void insert(int value) {
        if (value == val)
            return;

        if (value < val) {
            if (left == null)
                left = new TreeNode(value);
            else
                left.insert(value);
        } else {
            if (right == null)
                right = new TreeNode(value);
            else
                right.insert(value);
        }
    }
}
