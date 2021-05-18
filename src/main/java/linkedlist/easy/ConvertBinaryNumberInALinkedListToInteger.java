package linkedlist.easy;

import linkedlist.ListNode;

public class ConvertBinaryNumberInALinkedListToInteger {

    // Aproach 1 (own)
    public int getDecimalValue1(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while(head != null) {
            sb.append(head.val);
            head = head.next;
        }

        String binaryStr = sb.toString();
        int decimalNumber = 0, pow = binaryStr.length() - 1;

        for (int i = 0; i < binaryStr.length(); i++)
            decimalNumber += Integer.parseInt(String.valueOf(binaryStr.charAt(i))) * Math.pow(2, pow--);

        return decimalNumber;
    }

    // Aproach 2
    public int getDecimalValue2(ListNode head) {
        int num = head.val;
        while (head.next != null) {
            num = num * 2 + head.next.val;
            head = head.next;
        }
        return num;
    }

    // Aproach 3
    public int getDecimalValue3(ListNode head) {
        int num = head.val;
        while (head.next != null) {
            num = (num << 1) | head.next.val;
            head = head.next;
        }
        return num;
    }
}
