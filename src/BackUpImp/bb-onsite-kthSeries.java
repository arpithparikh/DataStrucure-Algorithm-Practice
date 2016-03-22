时间Onlogn，空间O1
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}

时间On，空间O1 ，快排
public class Solution {
	public int findKthLargest(int[] nums, int k) {
		if(nums == null || nums.length == 0) {
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
		int pivot = nums[left];
		while(left < right) {
			while(left < right && nums[right] > pivot) {
				right--;
			}
			if(left < right) {
				doSwap(nums, left, right);
				left++;
			}
			while(left < right && nums[left] <= pivot) {
				left++;
			}
			if(left < right) {
				doSwap(nums, left, right);
				right--;
			}
		}
		nums[left] = pivot;
		if(left + 1 == k) {
			return pivot;
		}
		else if(left + 1 < k) {
			return findKth(nums, start, left - 1, k);
		}
		else {
			return findKth(nums, left + 1, right, k);
		}
	}
}
