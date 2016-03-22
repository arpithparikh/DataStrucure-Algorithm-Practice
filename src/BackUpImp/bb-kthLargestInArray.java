时间Onlogn
public class Solution {
	public int find(int[] nums, int k) {
		if(nums == null || nums.length == 0 || nums.length < k) {
			return 0;
		}
		Arrays.sort(nums);
		return nums[nums.length - k];
	}
}
时间On空间On
public class Solution {
	public int find(int[] nums, int k) {
		if(nums == null || nums.length == 0 || nums.length < k) {
			return 0;
		}
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		int size = k;
		for(Integer item : nums) {
			if(minHeap.size() < size) {
				minHeap.offer(item);
			}
			else {
				if(minHeap.peek() < item) {
					minHeap.poll();
					minHeap.offer(item);
				}
			}
		}
		return minHeap.poll();
	}
}
时间On空间O1，quick select
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length == 0 || nums.length < k) {
			return 0;
		}
		return findKth(nums, 0, nums.length - 1, nums.length - k + 1);
	}
	private int findKth(int[] nums, int start, int end, int k) {
		if(start > end) {
			return 0;
		}
		int left = start;
		int right = end;
		int pivot = nums[start];
		while(left < right) {
			while(left < right && nums[right] > pivot) {
				right--;
			}
			if(left < right) {
				nums[left] = nums[right];
				left++;
			}
			while(left < right && nums[left] <= pivot) {
				left++;
			}
			if(left < right) {
				nums[right] = nums[left];
				right--;
			}
		}
		nums[left] = pivot;
		if(left + 1 == k) {
			return pivot;
		}
		else if(left + 1 < k) {
			return findKth(nums, left + 1, end, k);
		}
		else {
			return findKth(nums, start, left - 1, k);
		}
    }
}