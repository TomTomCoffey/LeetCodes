package LeetCodes;

public class Problem790 {

    public int numTilings(int n) {

        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        //// this base

        long[] nums = new long[n];
        int modulo = (int) Math.pow(10, 9) + 7;
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 5;
        for (int i = 3; i < nums.length; i++) {

            nums[i] = (int) (((nums[i - 1] * 2) + nums[i - 3]) % modulo);

        }

        return (int) nums[nums.length - 1];

    }

}
