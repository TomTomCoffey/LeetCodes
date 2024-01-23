import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem187 {
    public List<String> findRepeatedDnaSequences(String s) {

        List<String> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int len = s.length();
        String temp;

        if (len < 10)
            return ans;

        for (int i = 0; i < len - 9; i++) {

            temp = s.substring(i, i + 10);

            if (map.containsKey(temp)) {
                map.replace(temp, map.get(temp), 1 + map.get(temp));
            } else {
                map.put(temp, 1);
            }

        }

        for (Map.Entry<String, Integer> element : map.entrySet()) {

            if (element.getValue() >= 2) {
                ans.add(element.getKey());
            }
        }

        return ans;
    }
}
