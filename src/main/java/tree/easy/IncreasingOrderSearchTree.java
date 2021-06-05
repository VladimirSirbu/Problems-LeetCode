package tree.easy;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node
 * in the tree is now the root of the tree, and every node has no left child and only one right child.
 * **/

public class IncreasingOrderSearchTree {

    public TreeNode newRoot;
    public TreeNode curr;

    public TreeNode increasingBST1(TreeNode root) {
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


    // Aproach 2
    public TreeNode increasingBST2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);

        TreeNode ans = new TreeNode(0);
        TreeNode curr = ans;
        for (int element : list) {
            curr.right = new TreeNode(element);
            curr = curr.right;
        }
        return ans.right;
    }

    public void inOrder(TreeNode root, List<Integer> vals) {
        if (root.left != null)
            inOrder(root.left, vals);

        vals.add(root.val);

        if (root.right != null)
            inOrder(root.right, vals);
    }
}
