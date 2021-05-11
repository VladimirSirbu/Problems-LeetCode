package string.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseVowelsOfAString {

    // Aproach 1 (using a stack)
    public String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character ch : s.toCharArray())
            if (isVowel(ch))
                stack.push(ch);

        StringBuilder strBuild = new StringBuilder();
        for (Character ch : s.toCharArray()) {
            if (isVowel(ch))
                strBuild.append(stack.pop());
            else
                strBuild.append(ch);
        }

        return strBuild.toString();
    }

    // Aproach 2 (own -> with two pointers)
    public String reverseVowels1(String s) {
        if (s.length() == 1)
            return s;

        char[] arr = s.toCharArray();

        int leftIndex = 0;
        int rigthIndex = s.length() - 1;

        while (leftIndex <= rigthIndex) {
            if (!isVowel(arr[leftIndex]))
                leftIndex++;
            if (!isVowel(arr[rigthIndex]))
                rigthIndex--;

            if (isVowel(arr[leftIndex]) && isVowel(arr[rigthIndex]) && leftIndex <= rigthIndex) {
                swapVowels(arr, leftIndex, rigthIndex);
                leftIndex++;
                rigthIndex--;
            }
        }
        return String.valueOf(arr);
    }

    private void swapVowels(char[] array, int x, int y) {
        char temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    private boolean isVowel(Character c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
