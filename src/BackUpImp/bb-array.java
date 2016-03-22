Two unsorted array
output  3 sorted array, 
one of which contains the dumplicated elements in both array

1, 3, 5, 7, 8, 9, 10, 11
2, 4, 6, 8, 10

Output
1, 3, 5, 7, 9, 11
2, 4, 6
8, 10

public class merge {
	public void merge(int[] nums1, int[] nums2) {
		HashSet<Integer> res = new HashSet<Integer>();
		ArrayList<Integer> res1 = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		for(Integer item : nums1) {
			set.add(item);
		}
		for(Integer item : nums2) {
			if(set.contains(item)) {
				res.add(item);
				res1.add(item);
			}
		}
		
	}
}