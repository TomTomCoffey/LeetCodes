package LeetCodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem17 {

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits.equals(""))
            return ans;

        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backTrack(map, ans, 0, "", digits);
        return ans;

    }

    public void backTrack(HashMap<Character, String> map, List<String> ans, int i, String current, String digits) {

        if (current.length() == digits.length()) {
            ans.add(current);
            return;
        }

        char[] c = map.get(digits.charAt(i)).toCharArray();

        for (int j = 0; j < c.length; j++) {
            backTrack(map, ans, i + 1, current + c[j], digits);
        }

    }

}
