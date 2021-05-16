package linkedlist.easy;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

    // Aproach 1 -> every element of node append to string builder and then check if is equal to its reverse
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.getVal());
            head = head.getNext();
        }
        return sb.toString().equals(sb.reverse().toString());
    }

    // Aproach 2
    public boolean isPalindrome1(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current.getVal());
            current = current.getNext();
        }

        current = head;
        int index = list.size() - 1;

        while (current != null & index >= 0) {
            if (current.getVal() != list.get(index))
                return false;
            current = current.getNext();
            index--;
        }
        return true;
    }
}
