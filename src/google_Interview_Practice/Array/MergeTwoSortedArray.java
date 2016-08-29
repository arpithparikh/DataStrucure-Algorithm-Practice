package google_Interview_Practice.Array;
public class MergeTwoSortedArray {
	public void merge(int[] A,int[] B,int m,int n){
		while(m  > 0 && n > 0){
			if(A[m - 1] > B[n - 1]){//	
				A[m+n -1] = A[m -1];
				m--;
			}else{
				A[m+n-1] = B[n-1];
				n--;
			}
		} 
		while(n > 0){
			A[m + n - 1] = B[n - 1];
			n--;
		}
	}
}
