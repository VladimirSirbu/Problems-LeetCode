package linkedlist.medium;

import linkedlist.ListNode;

public class AddTwoNumbers {

    // Approach 1 (own)
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
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

    // Aproach 2 (leet-code)
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

}
