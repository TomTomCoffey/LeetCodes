import java.util.HashSet;

public class Problem287 {
    public int findDuplicate(int[] nums) {

        HashSet<Integer> al = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!al.contains(nums[i]))
                al.add(nums[i]);
            else {
                return nums[i];
            }

        }
        return 80085;

    }
}
