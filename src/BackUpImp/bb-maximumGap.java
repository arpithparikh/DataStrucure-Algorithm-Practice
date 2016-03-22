从A数组中选一个数a, 
从B数组中选一个数b，要求a - b的值最大并且a的index不等于b的index

public class Solution {
	public int find(int[] nums1, int[] nums2) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < nums1.length; i++) {
			for(int j = 0; j < nums2.length; j++) {
				if(j == i) {
					continue;
				}
				else {
					max = Math.max(max, nums1[i] - nums2[j]);
				}
			}
		}
		return max;
	}
}

public class Solution {
	public int find(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		return nums1[nums1.length - 1] - nums2[0];
	}
}