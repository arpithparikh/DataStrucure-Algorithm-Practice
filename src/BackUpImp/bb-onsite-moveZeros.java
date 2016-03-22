利用一个nonZero的表示来不断进行swap，
之所以利用到nonZero是因为数组中一开始就没有0，考虑到这种特殊情况
public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0) {
        	return;
        }
        int nonZero = 0;
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] != 0) {
        		doSwap(nums, i, nonZero);
        		nonZero++;
        	}
        }
    }
}
时间上要优化一下，不需要每次都swap而是类似remove duplicate的做法，
进行0个数的统计然后对数组末未开始的元素重新赋值
public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0) {
        	return;
        }
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] == 0) {
        		count++;
        	}
        	else {
        		nums[i - count] = nums[i]; 
        	}
        }
        for(int i = 0; i < count; i++) {
        	nums[nums.length - 1 - i] = 0;
        }
    }
}