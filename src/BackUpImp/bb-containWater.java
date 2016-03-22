Trapping Rain Water
public class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0) {
            return 0;
        }
        int length = height.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int leftMax = height[0];
        int rightMax = height[length - 1];
        left[0] = leftMax;
        right[length - 1] = rightMax;
        for(int i = 1; i < length; i++) {
            left[i] = Math.max(leftMax, height[i]);
            leftMax = Math.max(leftMax, height[i]);
        }
        for(int i = length - 2; i >= 0; i--) {
            right[i] = Math.max(rightMax, height[i]);
            rightMax = Math.max(rightMax, height[i]);
        }
        int res = 0;
        for(int i = 0; i < length; i++) {
            res += (Math.min(left[i], right[i]) - height[i]);
        }
        return res;
    }
}

Container With Most Water
public class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) {
            return 0;
        }
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right) {
            int h = Math.min(height[left], height[right]);
            int base = right - left;
            max = Math.max(max, h * base);
            if(height[right] > height[left]) {
                left++;
            }
            else {
                right--;
            }
        }
        return max;
    }
}Container With Most Water