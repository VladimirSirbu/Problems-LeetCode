package algorithms.tests.tree.easy;

import org.junit.Assert;
import org.junit.Test;
import tree.Tree;
import tree.easy.IncreasingOrderSearchTree;

import static org.junit.Assert.*;

public class TestIncreasingOrderSearchTree {

    private IncreasingOrderSearchTree incSearchTree = new IncreasingOrderSearchTree();

    @Test
    public void testIncreasingBST() {

        Tree givenTree = new Tree();
        givenTree.insert(5);
        givenTree.insert(3);
        givenTree.insert(2);
        givenTree.insert(1);
        givenTree.insert(4);
        givenTree.insert(6);
        givenTree.insert(8);
        givenTree.insert(7);
        givenTree.insert(9);

        Tree expectedTree = new Tree();
        for (int i = 1; i < 10; i++) {
            expectedTree.insert(i);
        }

        assertEquals(expectedTree.root, incSearchTree.increasingBST1(givenTree.root));
        assertEquals(expectedTree.root, incSearchTree.increasingBST2(givenTree.root));
    }
}
