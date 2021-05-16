package linkedlist.easy;

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
}
