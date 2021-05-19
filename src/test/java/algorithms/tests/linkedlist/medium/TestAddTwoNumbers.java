package algorithms.tests.linkedlist.medium;

import linkedlist.LinkedList;
import linkedlist.ListNode;
import linkedlist.medium.AddTwoNumbers;
import org.junit.Test;



import static org.junit.Assert.*;

public class TestAddTwoNumbers {

    private AddTwoNumbers addNum = new AddTwoNumbers();

    @Test
    public void testAddTwoNumbers() {
        ListNode l1 = initList(3,4,2);
        ListNode l2 = initList(4,6,5);
        ListNode sumList = initList(8,0,7);
        assertTrue(addNum.addTwoNumbers1(l1,l2).equals(sumList));
    }

    @Test
    public void testAddTwoNumbers1() {
        ListNode l1 = initList(9,9,9,9,9,9,9);
        ListNode l2 = initList(9,9,9,9);
        ListNode sumList = initList(1,0,0,0,9,9,9,8);
        assertTrue(addNum.addTwoNumbers1(l1,l2).equals(sumList));
    }

    @Test
    public void testAddTwoNumbers2() {
        ListNode l1 = initList(3,4,2);
        ListNode l2 = initList(4,6,5);
        ListNode sumList = initList(8,0,7);
        assertTrue(addNum.addTwoNumbers2(l1,l2).equals(sumList));
    }

    @Test
    public void testAddTwoNumbers3() {
        ListNode l1 = initList(9,9,9,9,9,9,9);
        ListNode l2 = initList(9,9,9,9);
        ListNode sumList = initList(1,0,0,0,9,9,9,8);
        assertTrue(addNum.addTwoNumbers2(l1,l2).equals(sumList));
    }

    private ListNode initList(int... nums) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < nums.length; i++) {
            list.addToFront(nums[i]);
        }
        return list.getHead();
    }
}
