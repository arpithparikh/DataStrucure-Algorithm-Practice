//Maximum Subarray
//given array
//[-2,2,-3,4,-1,2,1,-5,3];

//contiguous subarray[4,-1,2,1] => Largest Sum = 6;

public class Solution{
	
	public int maxSubArray(int[] nums){

		int max = Integer.MIN_VALUE;
		int min = 0;
		int sum = 0;

		for(int i = 0; i < nums.length ; i++){

			sum += nums[i];

			min = Math.min(min,sum - max);
			max = Math.max(sum,maxsum);
		}

		return min;
	}
}

