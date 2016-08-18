//Closest Number in sorted Array 

public class Solution{
	
	public int closestNumber(int[] A, int target){
		//difference 
		int diff = 0;
		//candidate 
		int candidate = 0;
		//min =
		
		int min = Integer.MAX_VALUE;

		for(int i = 0 ; i < A.length ; i++){

			diff = Math.abs(A[i] - target);

			if(diff < min){

				min = diff;
				candidate = i;
			}
		}

		return candidate;
	}
}