package string.medium;

public class RemoveAllOccurrencesOfASubstring {

    public String removeOccurrences(String s, String part) {
        if (s.equals(part))
            return "";

        StringBuilder newS = new StringBuilder(s);

        while(newS.indexOf(part) != -1){
            newS.delete(newS.indexOf(part), newS.indexOf(part) + part.length());
        }
        return newS.toString();

        /*if (s.equals(part))
            return "";

        String newS = s;

        while(newS.contains(part)){
            newS = newS.replaceFirst(part, "");
        }
        return newS;*/

        /*String newS = s;
        int partLen = part.length();
        boolean find = true;

        while (find) {
            find = false;
            for (int i = 0; i < newS.length() && i + partLen <= newS.length(); i++) {
                if (newS.substring(i, i + partLen).equals(part)) {
                    find = true;
                    newS = newS.substring(0, i).concat(newS.substring(i + partLen));
                }
            }
        }
        return newS;*/
    }
}
