package LeetCodes;

public class Problem11 {

    public int maxArea(int[] height) {

        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {

            if ((right - left) * Math.min(height[left], height[right]) > max) {
                max = (right - left) * Math.min(height[left], height[right]);
            }

            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }

        }

        return max;

    }

}
