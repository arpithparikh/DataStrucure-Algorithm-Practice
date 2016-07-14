//find the Merge Sorted Array:


//Easiest One
class Solution{

	public int[] mergeSortedArray(int[] A, int[] B){

		//To combine length of the both 
		int[] res = new int[A.length + B.length];

		//Define the those three parameters 
		
		int i = 0;
		int j = 0;
		int k = 0;


		   //i < A.length and j < B.length

		while(i < A.length && j < B.length){

			if(A[i] < B[j]){

				res[k] = A[i];
				i++;

			}
			else{

				res[k] =B[j];
				j++;
			}
			k++;	
		}

		while(i < A.length){

			res[k] = A[i];
			i++;
			k++;
		}
		while(j < B.length){

			res[k] = B[j];
			i++;
			k++;
		}
		return res;

	}
}