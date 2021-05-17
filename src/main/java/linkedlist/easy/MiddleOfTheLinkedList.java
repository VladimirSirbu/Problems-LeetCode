package linkedlist.easy;

import java.util.ArrayList;
import java.util.List;

public class MiddleOfTheLinkedList {

    // Aproach 1 (own)
    public ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current);
            current = current.next;
        }
        return list.get(list.size() / 2);
    }
}
