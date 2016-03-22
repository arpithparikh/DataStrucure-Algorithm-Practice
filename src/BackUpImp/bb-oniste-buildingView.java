public class Solution {
	public int viewSum(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		int sum = 0;
		for(int i = 0; i < nums.length - 1; i++) {
			if(nums[i + 1] > nums[i]) {
				sum += (nums[i + 1] - nums[i]);
			}
		}
		return sum;
	}
}


