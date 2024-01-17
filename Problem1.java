import java.util.HashMap;

class Problem1 {

    public static void main(String[] args) {

        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        Problem1 p1 = new Problem1();

        int[] ans = p1.twoSum(nums, target);

        System.out.println(ans[0] + " " + ans[1]);

    }

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                int[] ans = new int[2];
                ans[0] = i;
                ans[1] = map.get(target - nums[i]);
                return ans;

            }

            map.put(nums[i], i);

        }

        return new int[2];

    }

}