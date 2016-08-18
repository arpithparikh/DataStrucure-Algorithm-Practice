package LintCode_Main;

public class KthLargestElement {

	public int kthLargestElement1(int k, int[] nums) {
		
        // write your code here
		if (nums == null || nums.length == 0) {
            return 0;
        }
        if (k <= 0) {
            return 0;
        }
        return helper(nums, 0, nums.length - 1, nums.length - k + 1);
    }

	private int helper(int[] nums, int l, int r, int k) {
		// TODO Auto-generated method stub
		if (l == r) {
            return nums[l];
        }
        int position = partition(nums, l, r);
        if (position + 1 == k) {
            return nums[position];
        } else if (position + 1 < k) {
            return helper(nums, position + 1, r, k);
        }  else {
            return helper(nums, l, position - 1, k);
        }
	}
	
	  public int partition(int[] nums, int l, int r) {
	     
	        int left = l, right = r;
	        int pivot = nums[left];
	        
	       
	        while (left < right) {
	            while (left < right && nums[right] >= pivot) {
	                right--;
	            }
	            nums[left] = nums[right];
	            while (left < right && nums[left] <= pivot) {
	                left++;
	            }
	            nums[right] = nums[left];
	        }
	        
	       
	        nums[left] = pivot;
	        return left;         
	    }

}
