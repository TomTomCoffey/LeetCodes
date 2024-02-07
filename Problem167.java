public class Problem167 {
    public int[] twoSum(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        while(left < right){
            if(nums[left] + nums[right] == target){
                int[] ans = {left+1, right+1};
                return ans;
            }
            if(nums[left] + nums[right] > target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[2];
    }
    
}
