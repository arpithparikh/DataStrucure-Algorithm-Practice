Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous subarray [4,−1,2,1] has the largest sum = 6.

public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) {
        	return 0;
        }
        for(int i = 0; i < nums.length; i++) {
        	for(int j = i; j < nums.length; i++) {
        		int sum = getSum(nums, i, j);
        		max = Math.max(max, sum);
        	}
        }
        return max;
    }
    private int getSum(int[] nums, int i, int j) {
    	int sum = 0;
    	for(int k = i; k <= j; k++) {
    		sum += nums[k];
    	}
    	return sum;
    }
}

public class Solution {
	public int maxSubArray(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
			max = Math.max(max, sum);//这是一个基于上一次最好结果的一种max]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
			sum = Math.max(sum, 0);//这一步相当于是一个贪心做法，只取当前最有利的
		}
		return max;
	}
}

public class Solution {
	public int maxSubArray(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		int length = nums.length;
		int[] global = new int[length];
		int[] local = new int[length];
		global[0] = nums[0];
		local[0] = nums[0];
		for(int i = 1; i < length; i++) {
			local[i] = Math.max(local[i - 1] + nums[i], nums[i]);
			global[i] = Math.max(global[i - 1], local[i]);
		}
		return global[length - 1];
	}
}