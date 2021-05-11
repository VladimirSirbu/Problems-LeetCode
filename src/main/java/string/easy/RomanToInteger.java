package string.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    private static Map<String, Integer> romanNumbers = new HashMap<>();

    public int romanToInt(String s) {
        initMap();
        if (s.length() == 1)
            return romanNumbers.get(String.valueOf(s.charAt(0)));

        int num = 0;
        int i = s.length() - 1;
        while (i >= 0) {
            try {
                int currentNum = romanNumbers.get(String.valueOf(s.charAt(i)));
                int previosNum = romanNumbers.get(String.valueOf(s.charAt(i - 1)));
                if (currentNum > previosNum) {
                    num += currentNum - previosNum;
                    i -= 2;
                } else {
                    num += currentNum;
                    i--;
                }
            } catch (IndexOutOfBoundsException e) {
                num += romanNumbers.get(String.valueOf(s.charAt(i)));
                return num;
            }
        }
        return num;
    }

    private static void initMap() {
        romanNumbers.put("I", 1);
        romanNumbers.put("V", 5);
        romanNumbers.put("X", 10);
        romanNumbers.put("L", 50);
        romanNumbers.put("C", 100);
        romanNumbers.put("D", 500);
        romanNumbers.put("M", 1000);
    }
}
