public class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[start] > nums[mid]) {
                if(target >= nums[mid] && target <= nums[end]) {
                    start = mid;
                }
                else {
                    end = mid;
                }
            }
            else if(nums[start] < nums[mid]) {
                if(target >= nums[start] && nums[mid] >= target) {
                    end = mid;
                }
                else {
                    start = mid;
                }
            }
        }
        if(nums[start] == target) {
            return start;
        }
        else if(nums[end] == target) {
            return end;
        }
        else {
            return -1;
        }
    }
}