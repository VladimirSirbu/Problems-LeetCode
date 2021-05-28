package tree;

public class Tree {

    public TreeNode root;

    public void insert(int value) {
        if (root == null)
            root = new TreeNode(value);
        else
            root.insert(value);
    }
}
