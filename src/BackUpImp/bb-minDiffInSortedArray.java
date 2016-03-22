
public class minDiff {
	public void find(int[] nums1, int[] nums2) {
		int index1 = 0;
		int index2 = 0;
		int minDiff = Integer.MAX_VALUE;
		while(index1 < nums1.length && index2 < nums2.length) {
			minDiff = Math.min(minDiff, Math.abs(nums1[index1] - nums2[index2]));
			if(nums1[index1] > nums2[index2]) {
				index2++;
			}
			else {
				index1++;
			}
		}
		System.out.print(minDiff);
	}
	public static void main(String[] args) {
		minDiff m = new minDiff();
		int[] nums1 = {1,2,3,4,5,6,7};
		int[] nums2 = {1,9,10,11};
		m.find(nums1, nums2);
	}
}
