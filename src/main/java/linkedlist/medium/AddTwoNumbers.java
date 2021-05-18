package linkedlist.medium;

import linkedlist.ListNode;

public class AddTwoNumbers {

    // Approach 1 (own)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode currentNode = null;
        int sum = 0, offset = 0, nextDigit = 0;

        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + offset;
            nextDigit = sum % 10;
            offset = sum / 10;

            // add new node to end of list
            ListNode node = new ListNode(nextDigit);
            if (head == null) {
                head = node;
                currentNode = head;
            } else {
                currentNode.next = node;
                currentNode = node;
            }

            l1 = l1.next;
            l2 = l2.next;

            if (l1 == null && l2 != null)
                l1 = new ListNode(0);

            if (l2 == null && l1 != null)
                l2 = new ListNode(0);
        }

        if (offset != 0)
            currentNode.next = new ListNode(offset);

        return head;
    }

}
