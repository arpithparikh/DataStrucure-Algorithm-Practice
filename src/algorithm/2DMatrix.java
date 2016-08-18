//2D Matrix 


public class Solution{
	
	//Search 2D Matrix 
	public boolean Search2DMatrix(int [][] matrix , int target){

		//Start = 0;
		int start = 0;

		//End 
		int end = matrix.length - 1;

		//
		int row = 0, column = 0;

		//Start + 1 < end 
		while(start + 1 < end){

			int mid = (start + end)/2;

			if(matrix[mid][0] == target){

				return true;
			}else if(matrix[mid][0] < target){

				start = mid;
			}else{

				end = mid;
			}
		}
	}
}
}