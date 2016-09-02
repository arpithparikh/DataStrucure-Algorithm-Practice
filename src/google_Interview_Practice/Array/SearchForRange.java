package google_Interview_Practice.Array;

public class SearchForRange {

	public int[] searchRange(int[] nums,int target){
		if(nums == null || nums.length == 0){
			return null;
		}
		//array with size of 2
		int[] arr = new int[2];
		arr[0] = -1; //at the zero index
		arr[1] = -1; //at the first index
		binarySearch(nums, 0,nums.length - 1,target,arr); //
		return arr;
 	}

	private void binarySearch(int[] nums, int left, int right, int target, int[] arr) {
		// TODO Auto-generated method stub
		if(right < left){ //right < left
			return;
		}
		if(nums[left]==nums[right] && nums[left] == target){ 
			arr[0] = left;
			arr[1] = right;
			return;
		}
		
		int mid = left + (right - left)/2; //mid of the array
		
		if(nums[mid] <target){
			binarySearch(nums, mid + 1, right, target, arr);
		}else if(nums[mid] > target){
			binarySearch(nums, left, mid, target, arr);
		}else{
			arr[0] = mid;
			arr[1] = mid;	
			
			//handle duplicates - left
			int t1 = mid;
			while(t1 > left && nums[t1] == nums[t1 -1]){
				t1 -- ;
				arr[0] = t1;
			}
			
			//handle duplicates - right
			int t2 = mid;
			while(t2 < right && nums[t2] == nums[t2+1]){
				t2 ++;
				arr[1] =t2;
			}
			return ;
		}
	}

}
