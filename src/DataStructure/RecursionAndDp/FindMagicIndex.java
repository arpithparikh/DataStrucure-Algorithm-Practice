//Problem :  A magic index in an array A[0,1...n-1] is defined to be an index such that
// A[i] = i. Given a sorted array of distinct integers,
// write a method to find a magic index, if one exists, in an array

package DataStructure.RecursionAndDp;

//There are three scenario we can consider to solve the particular problem.
//1.Brute Force
//2.Binary Search Search
//3
public class FindMagicIndex {

	//1.brute force, time complexity On, space complexity O1
	public int findMagicIndex(int[] nums){

		if(nums==null || nums.length==0)
			return -1;
		
		for(int i=0;i<nums.length;i++)
			if(nums[i]==i)
		return i;
		
		return -1;
	}
	
	//2.Binary Search Algorithm,
	public int findMagicIndex2(int[] nums)
	{
		if(nums==null || nums.length==0)
			return -1;
		
		return helper(nums,0,nums.length-1);	
	}

	private int helper(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		if(end<start || start<0 || end>=nums.length)
		return -1;
		
		//Middle element selection using the following problem.
		int mid=start+(end-start)/2;
		
		if(nums[mid]==mid)
			return mid;
		
		else if(nums[mid]>mid)
			 return helper(nums, start, mid - 1);
		else
			 return helper(nums, mid+1, end);

	}
	
	//3. if the values are not distinct ?
	public int findMagicIndex3(int[] nums)
	{
			if(nums==null || nums.length==0)
				
				return -1;
			
			return helper2(nums,0,nums.length-1);
		
	}

	private int helper2(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		
		if(end<start || start<0 || end>=nums.length)
			return -1;
		
		int mid=start+(end-start)/2;
		
		if(nums[mid]==mid)
			return mid;
		
		int leftIndex=Math.min(mid-1,nums[mid]);
		
		int left=helper2(nums,start,leftIndex);
		
		if(left>=0)
			return left;
		
		int rightIndex=Math.max(nums[mid], mid+1);
		
		int right=helper2(nums,rightIndex,end);
		
		if(right<nums.length)
			return right;
		return right;
	}

}
