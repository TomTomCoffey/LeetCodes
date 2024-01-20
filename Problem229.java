import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem229 {

    public List<Integer> majorityElement(int[] nums) {

        double target = nums.length / 3;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.replace(nums[i], map.get(nums[i]), 1 + map.get(nums[i]));
            }
        }

        for (Map.Entry<Integer, Integer> element : map.entrySet()) {

            if (element.getValue() > target) {
                ans.add(element.getKey());
            }
        }
        return ans;

    }

}
