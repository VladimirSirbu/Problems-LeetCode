package linkedlist;

public class LinkedList {

    private ListNode head;

    public void addToFront(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
    }

    public ListNode getHead() {
        return head;
    }

}
