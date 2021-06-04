package algorithms.tests.tree.easy;

import org.junit.Test;
import tree.Tree;
import tree.easy.BinaryTreeInorderTraversal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class TestBinaryTreeInorderTraversal {

    private BinaryTreeInorderTraversal traversal = new BinaryTreeInorderTraversal();

    @Test
    public void testInorderTraversal1() {
        Tree tree = new Tree();
        for (int i = 1; i < 4; i++) {
            tree.insert(i);
        }
        List<Integer> expectedInOrderElements = Arrays.asList(1,2,3);

        assertEquals(expectedInOrderElements, traversal.inorderTraversal(tree.root));
    }

    @Test
    public void testInorderTraversal2() {
        Tree tree = new Tree();
        List<Integer> expectedInOrderElements = Collections.emptyList();
        assertEquals(expectedInOrderElements, traversal.inorderTraversal(tree.root));
    }

    @Test
    public void testInorderTraversal3() {
        Tree tree = new Tree();
        tree.insert(1);

        List<Integer> expectedInOrderElements = Arrays.asList(1);

        assertEquals(expectedInOrderElements, traversal.inorderTraversal(tree.root));
    }

    @Test
    public void testInorderTraversal4() {
        Tree tree = new Tree();
        tree.insert(1);
        tree.insert(2);

        List<Integer> expectedInOrderElements = Arrays.asList(1,2);

        assertEquals(expectedInOrderElements, traversal.inorderTraversal(tree.root));
    }
}
