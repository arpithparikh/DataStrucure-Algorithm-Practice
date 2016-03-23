//Find the kth largest element in the array
//For an example : [9,3,2,4,8] the 3rd largest number is 4
//Challenge in the O(n) time

package LintCode;

import java.util.Arrays;

public class KthLargestElement {
	
	//brute force approach O(nlogn)
	public static int KthLargest(int array[],int k)
	{
		
		if(array.length==0 || array.length<1 ||	array.length<k)
		{
			return 0;
		}
		Arrays.sort(array);
		
		return array[array.length-k];
		
	}
	
	//in the O(n) time using the Quick Select
	
	//Divide and Conquer algorithm 
	//it pick the pivot elements and partitions it based on the pivot 
	//There are several version of choosing the pivot element 
	//1.first pivot,2.last pivot,3.pick random pivot,4.pick median as pivot
	
	
	public int findKthLargest(int[] nums,int k)
	{
		//precondition
		if(k<1 || nums==null)
		
			return 0;	
		else
			//
			return getkthElement(nums.length-k+1,nums,0,nums.length-1);
	}

	private int getkthElement(int k, int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		
		//selecting the pivot element as the last element initially.
		int pivot=nums[end];
	
		//left and right 
		int left=start;
		
		int right=end;
		
		
		while(true)
		{
			//if the left element is smaller than the pivot and left index less than right index
			while(nums[left]<pivot && left<right)
			{
				return left++;
			}
			
			//if the right element is greater than the pivot and right index is greater than the left
			while(nums[right]>=pivot && right>left)
			{
				return right--;
			}
			
			//if the left equals right
			if(left==right)
			{
				break;
			}
			
			//swap the 
			swap(nums,left,right);
		}
		
		
		swap(nums,left,right);
		
		//if the k==left+1
		if(k==left+1)
		{
			return pivot;
		}
		//k<left+1
		else if(k<left+1)
			return getkthElement(k, nums, start, end-1);
		else
			return getkthElement(k, nums, end+1 ,end);
	}
		
		
		
	
	//swap the numbers between each-others
	private void swap(int[] nums, int left, int right) {
		// TODO Auto-generated method stub
	
		//swapping 
		int temp=nums[left];
		nums[left]=nums[right];
		nums[right]=temp;
		
		
	}
	
	
	

}
