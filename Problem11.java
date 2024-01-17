package LeetCodes;

public class Problem11 {

    public int maxArea(int[] height) {

        int maxVal = 0;
        int right = height.length - 1;
        int left = 0;

        while (right >= 0) {
            int width = right - left;

            if (height[left] >= height[right]) {
                if (maxVal < width * height[right]) {
                    maxVal = width * height[right];
                }
                right--;
            } else if (height[right] > height[left]) {
                if (maxVal < width * height[left]) {
                    maxVal = width * height[left];
                }
                left++;

            } else {
                return maxVal;
            }

        }

        return maxVal;
    }

}
