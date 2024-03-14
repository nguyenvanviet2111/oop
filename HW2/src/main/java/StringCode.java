import java.util.HashSet;
import java.util.Set;
// CS108 HW1 -- String static methods
public class StringCode {
    /**
     * Given a string, for each digit in the original string,
     * replaces the digit with that many occurrences of the character
     * following. So the string "a3tx2z" yields "attttxzzz".
     * @param str
     * @return blown up string
     */
    public static String blowup(String str) {
        int len = str.length();
        if(len == 0){
            return null;
        }
        String s = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(i + 1))) {
                continue;
            }
            if (Character.isDigit(str.charAt(i))) {
                int x = str.charAt(i) - '0';
                for (int j = 0; j < x; j++) {
                    s += str.charAt(i + 1);
                }
            } else {
                s += str.charAt(i);
            }
        }
        if (!Character.isDigit(str.charAt(len - 1))) {
            s += str.charAt(len - 1);
        }
        return s;
    }
    /**
     * Given a string, returns the length of the largest run.
     * A a run is a series of adajcent chars that are the same.
     * @param str
     * @return max run length
     */
    public static int maxRun(String str) {
        int m = 1;
        int cnt = 1;
        for (int j = 0; j < str.length()-1; j++) {
            if(str.charAt(j) == str.charAt(j+1)){
                cnt++;
            }

            else {
                m = Math.max(m,cnt);
                cnt = 1;
            }
        }
        return m;
    }
    /**
     * Given 2 strings, consider all the substrings within them
     * of length len. Returns true if there are any such substrings
     * which appear in both strings.
     * Compute this in linear time using a HashSet. Len will be 1 or more.
     */
    public static boolean stringIntersect(String a, String b, int len) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i <= a.length() - len; i++) {
            set.add(a.substring(i, i + len));
        }
        for (int i = 0; i <= b.length() - len; i++) {
            if(set.contains(b.substring(i, i+len))){
                return true;
            }
        }
        return false;
    }
}