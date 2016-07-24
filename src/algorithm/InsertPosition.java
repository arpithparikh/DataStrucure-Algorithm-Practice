//Binary Search Search Insert Position 


[1,3,5,6] => 4
public class Solution{
	

	public int InsertPosition(int[] A,int target){


			if(A.length ==0){

				return 0;
			}
		int start = 0;

		int end = A.length - 1;

		while(start + 1 < end){

			int mid = (start + end)/2;

			if(A[mid] > target){

				end = mid;
			}else{

				start = mid;
			}
		}

		if(A[start] >= target){

			return start;
		}

		if(A[end] > = target){
			return end;
		}


		return A.length - 1;
	}



}