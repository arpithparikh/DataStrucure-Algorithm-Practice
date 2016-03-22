public class Solution {
	public int findCommon(int[] nums1, int[] nums2, int[] nums3) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(Integer item : nums1) {
			if(map.contains(item)) {
				continue;
			}
			else {
				map.put(item, 1);
			}
		}
		for(Integer item : nums2) {
			if(map.containsKey(item)) {
				map.put(item, map.get(item) + 1);
			}
		}
		for(Integer item : nums3) {
			if(map.containsKey(item) && map.get(item) == 2) {
				return item;
			}
		}
		return 0;
	}
}