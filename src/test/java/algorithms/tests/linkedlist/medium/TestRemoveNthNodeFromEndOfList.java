package algorithms.tests.linkedlist.medium;

import linkedlist.LinkedList;
import linkedlist.ListNode;
import linkedlist.medium.RemoveNthNodeFromEndOfList;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestRemoveNthNodeFromEndOfList {

    private RemoveNthNodeFromEndOfList remove = new RemoveNthNodeFromEndOfList();

    @Test
    public void testRemoveNthFromEnd1() {
        ListNode InitNode = initList(5,4,3,2,1);
        ListNode nodeToCompare = initList(5,3,2,1);
        int nThNode = 2;

        ListNode removeNode = remove.removeNthFromEnd(InitNode,nThNode);

        assertTrue(removeNode.equals(nodeToCompare));
    }

    @Test
    public void testRemoveNthFromEnd2() {
        ListNode InitNode = initList(2,1);
        ListNode nodeToCompare = initList(1);
        int nThNode = 1;

        ListNode removeNode = remove.removeNthFromEnd(InitNode,nThNode);

        assertTrue(removeNode.equals(nodeToCompare));
    }

    @Test
    public void testRemoveNthFromEnd3() {
        ListNode InitNode = initList(1);
        ListNode nodeToCompare = initList();
        int nThNode = 1;

        ListNode removeNode = remove.removeNthFromEnd(InitNode,nThNode);

        assertSame(removeNode, nodeToCompare);
    }


    private ListNode initList(int... nums) {
        if (nums.length == 0)
            return null;

        LinkedList list = new LinkedList();
        for (int i = 0; i < nums.length; i++) {
            list.addToFront(nums[i]);
        }
        return list.getHead();
    }
}
