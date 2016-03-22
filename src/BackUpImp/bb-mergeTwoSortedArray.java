public class Solution {
	public int[] merge(int[] nums1, int[] nums2) {
		if(nums1 == null || nums2 == null) {
			return (nums1 == null) ? nums2 : nums1;
		}
		int length1 = nums1.length;
		int length2 = nums2.length;
		int[] res = new int[length1 + length2];
		int index1 = 0;
		int index2 = 0;
		int index = 0;
		while(index1 < length1 && index2 < length2) {
			if(nums1[index1] < nums2[index2]) {
				res[index++] = nums1[index1++];
			}
			else {
				res[index++] = nums2[index2++];
			}
		}
		while(index1 < length1) {
			res[index++] = nums1[index1++];
		}
		while(index2 < length2) {
			res[index++] = nums2[index2++];
		}
		return res;
	}
}