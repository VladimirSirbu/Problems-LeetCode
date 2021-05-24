package linkedlist.medium;

import linkedlist.ListNode;

public class RemoveNthNodeFromEndOfList {

    // Approach 1
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        // create a new node that point to head
        // dummy is used to simplify some corner cases such as a list with only one node
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length  = 0; // track length of list
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n; // use (length - 1) to land at the node preceding the one to be deleted
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }

    // Approach 2
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode back = dummy;
        ListNode ahead = dummy;
        int i = 0;

        while (i < n + 1) {
            ahead = ahead.next;
            i++;
        }

        while (ahead != null) {
            ahead = ahead.next;
            back = back.next;
        }

        back.next = back.next.next;

        return dummy.next;
    }
}
