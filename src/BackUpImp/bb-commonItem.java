public class Solution {
	public ArrayList<Integer> find(int[] nums1, int[] nums2) {
		if(nums1 == null || nums2 == null) {
			return 0;
		}
		ArrayList<Integer> res = new ArrayList<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int index1 = 0;
		int index2 = 0;
		while(index1 < nums1.length && index2 < nums2.length) {
			if(nums1[index1] == nums2[index2]) {
				res.add(nums1[index1]);
				index1++;
				index2++;
			}
			else if(nums1[index1] > nums2[index2]) {
				index2++;
			}
			else {
				index1++;
			}
		}
		return res;
	}
}

public class Solution {
	public ArrayList<Integer> find(int[] nums1, int[] nums2) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(nums1 == null || nums2 == null) {
			return res;
		}
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < nums1.length; i++) {
			if(!set.contains(nums1[i])) {
				set.add(nums1[i]);
			}
		}
		for(int i = 0; i < nums2.length; i++) {
			if(set.contains(nums2[i])) {
				res.add(nums2[i]);
			}
		}
		return res;
	}
}