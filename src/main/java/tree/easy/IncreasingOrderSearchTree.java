package tree.easy;

import tree.TreeNode;

/**
 * Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node
 * in the tree is now the root of the tree, and every node has no left child and only one right child.
 * **/

public class IncreasingOrderSearchTree {

    public TreeNode newRoot;
    public TreeNode curr;

    public TreeNode increasingBST(TreeNode root) {
        traverseInOrder(root);
        return newRoot;
    }

    public void traverseInOrder(TreeNode root) {
        if (root.left != null)
            traverseInOrder(root.left);

        if (curr == null) {
            curr = new TreeNode(root.val);
            newRoot = curr;
        } else {
            curr.right = new TreeNode(root.val);
            curr = curr.right;
        }

        if (root.right != null)
            traverseInOrder(root.right);
    }
}
