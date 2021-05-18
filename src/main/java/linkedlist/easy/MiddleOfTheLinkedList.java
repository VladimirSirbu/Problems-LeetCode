package linkedlist.easy;

import linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MiddleOfTheLinkedList {

    // Aproach 1 (own)
    public ListNode middleNode1(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current);
            current = current.next;
        }
        return list.get(list.size() / 2);
    }

    // Aproach 2 (LeetCode)
    public ListNode middleNode2(ListNode head) {
        ListNode[] arr = new ListNode[100];
        int count = 0;
        while (head != null) {
            arr[count++] = head;
            head = head.next;
        }

        return arr[count / 2];
    }

    // Aproach 3 (LeetCode)
    public ListNode middleNode3(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
