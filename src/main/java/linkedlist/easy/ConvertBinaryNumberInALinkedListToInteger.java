package linkedlist.easy;

public class ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
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
}
