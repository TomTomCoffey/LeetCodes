import java.util.HashMap;
import java.util.Map;

public class Problem266 {
    public boolean canPermutePalindrome(String s) {

        int len = s.length();
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.replace(s.charAt(i), map.get(s.charAt(i)), 1 + map.get(s.charAt(i)));
            }

        }

        for (Map.Entry<Character, Integer> element : map.entrySet()) {
            if (element.getValue() % 2 == 1) {
                count++;
            }
        }

        if (count == 1 && len % 2 == 1) {
            return true;
        }

        return count == 0;

    }
}
