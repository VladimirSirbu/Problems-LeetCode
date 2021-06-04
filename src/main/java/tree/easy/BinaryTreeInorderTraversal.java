package tree.easy;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {


    List<Integer> inOrderElements;

    // Aproach 1 (revursive)
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

    // Aproach (iterative)
    public List<Integer> inorderTraversalIterative(TreeNode root) {
        if (root == null)
            return Collections.emptyList();

        inOrderElements = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || stack.size() > 0) {

            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            inOrderElements.add(current.val);

            current = current.right;
        }

        return inOrderElements;
    }
}
