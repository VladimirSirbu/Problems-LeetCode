package tree.easy;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeInorderTraversal {

    List<Integer> inOrderElements;

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return Collections.emptyList();

        inOrderElements = new ArrayList<>();
        storeDataInorderTraversal(root);
        return inOrderElements;
    }

    private void storeDataInorderTraversal(TreeNode root) {
        if (root.left != null)
            storeDataInorderTraversal(root.left);

        inOrderElements.add(root.val);

        if (root.right != null)
            storeDataInorderTraversal(root.right);
    }
}
