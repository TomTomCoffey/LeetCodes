import java.util.HashMap;
import java.util.Map;

public class Problem137 {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.replace(nums[i], map.get(nums[i]), (1 + map.get(nums[i])));
            }
        }
        for (Map.Entry<Integer, Integer> set : map.entrySet()) {

            if (set.getValue() == 1)
                return set.getKey();

        }

        return 80085;
    }
}
