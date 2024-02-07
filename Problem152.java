public class Problem152 {
    public int maxProduct(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }

        int run = 1;
        int max = 0;

        for(int i = 0; i < nums.length; i++){
            run = nums[i];
            max = Math.max(run, max);
            for(int j = i+1; j < nums.length; j++){
                run *= nums[j];
                max = Math.max(max, run);
            }
        }
        return max;
}
