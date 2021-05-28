package algorithms.tests.tree.easy;

import org.junit.Assert;
import org.junit.Test;
import tree.Tree;
import tree.easy.RangeSumOfBST;

import static org.junit.Assert.*;

public class TestRangeSumOfBST {

    private RangeSumOfBST rageSum = new RangeSumOfBST();

    @Test
    public void testRangeSumBST1() {
        Tree theTree = new Tree();
        int arr[] = {10, 5, 15, 3, 7, 18};
        for (int i = 0; i < arr.length; i++) {
            theTree.insert(arr[i]);
        }

        assertEquals(32, rageSum.rangeSumBST(theTree.root, 7, 15));
    }

    @Test
    public void testRangeSumBST2() {
        Tree theTree = new Tree();
        int arr[] = {10, 5, 15, 3, 7, 13, 18, 1, 6};
        for (int i = 0; i < arr.length; i++) {
            theTree.insert(arr[i]);
        }

        assertEquals(23, rageSum.rangeSumBST(theTree.root, 6, 10));
    }
}
