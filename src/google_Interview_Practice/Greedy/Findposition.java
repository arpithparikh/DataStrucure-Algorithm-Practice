//Classical Binary Search
public class Solution{
	public int findPosition(int[] A, int target, int end){
		if(A.length == 0 || A == null){
				return -1;
		}
		//Left
		int left = 0;
		//right 
		int right = A.length - 1;
		int mid = left + right/2;
		if(A[mid] == A[target]){
			return mid;
		}else if(A[mid] > A[target]){
			findPosition(A,left,mid - 1);}
			else{
			findPosition(A,mid + 1 , right);}
	}
}