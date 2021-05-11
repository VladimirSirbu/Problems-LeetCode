package string.easy;

public class LengthOfLastWord {

    // Aproach 1 (own)
    public int lengthOfLastWord1(String s) {
        String[] sArray = s.trim().split(" ");
        return sArray.length != 0 ? sArray[sArray.length - 1].length()  : 0;
    }

    // Aproach 2 (quickly)
    public int lengthOfLastWord2(String s) {
        int count = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0 && s.charAt(i) != ' ' ; i--) {
            count++;
        }
        return count;
    }
}
