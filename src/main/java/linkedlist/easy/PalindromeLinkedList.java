package linkedlist.easy;

import linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

    // Aproach 1 -> every element of node append to string builder and then check if is equal to its reverse
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }
        return sb.toString().equals(sb.reverse().toString());
    }

    // Aproach 2
    public boolean isPalindrome1(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }

        current = head;
        int index = list.size() - 1;

        while (current != null & index >= 0) {
            if (current.val != list.get(index))
                return false;
            current = current.next;
            index--;
        }
        return true;
    }
}
