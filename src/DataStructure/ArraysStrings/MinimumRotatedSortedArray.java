package DataStructure.ArraysStrings;
//left most element should greater than right most after rotation
//[0 1 2 4 5 6 7] => Sorted Array
//[4 5 6 7 0 1 2]
//Recursion 
public class MinimumRotatedSortedArray {
	public int findMin(int[] nums){
		return findMin(nums,0,nums.length - 1);
	}
	public int findMin(int[] num,int left,int right){
		if(left == right){
			return num[left];
		}
		if((right - left) == 1){
			return Math.min(num[left],num[right]);
		}
		int middle = left + (right - left)/2;
		//not rotated
		if(num[left] < num[right]){
			return num[left];
		}
		//go right side
		else if(num[middle] > num[left]){
			return findMin(num,middle,right);
		}
		else{
			return findMin(num,left,middle);
		}		
	}
}
