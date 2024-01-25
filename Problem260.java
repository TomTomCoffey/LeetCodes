import java.util.HashMap;
import java.util.Map;

public class Problem260 {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.replace(nums[i], map.get(nums[i]), (1 + map.get(nums[i])));
            }
        }
        for (Map.Entry<Integer, Integer> set : map.entrySet()) {

            if (set.getValue() == 1)
                ans[j++] = set.getKey();

        }
        return ans;

    }
}
