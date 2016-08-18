//First Position of the Target 
//[1,2,3,3,4,5,10]
public class Solution{
	public int binarySearch(int[] nums, int target){
		int start = 0; //0
		int end = nums.length - 1;
		while(start + 1 < end){
			int mid = (start + end) / 2;
			if(nums[mid]  >= target){
				end = mid;
			}else{
				start = mid;
			}
		}
		if(nums[start] == target){
			return start;
		}
		if(nums[end] ==  target){
			return end;
		}
	}
}