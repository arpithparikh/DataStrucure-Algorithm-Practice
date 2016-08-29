package google_Interview_Practice.Array;

public class MedianOfTwoSortedArray {
	
	
	public double findMedianSortedArray(int[] nums1,int[] nums2){
		//m and n 
		int m = nums1.length;
		int n = nums2.length;
		
		if((m+n)%2==0){
			
			return(findKth((m+n)/2,nums1,0,nums2,0) + findKth((m+n)/2+1,nums1,0,nums2,0));
		}else{
			
			return findKth((m+n)/2+1,nums1,0,nums2,0);
		}
		
	
		
	}

	private int findKth(int k, int[] nums1, int mstart, int[] nums2, int nstart) {
		// TODO Auto-generated method stuff
		if(mstart >=nums1.length){
			return nums2[nstart+k - 1];
		}
		if(nstart >=nums2.length){
			return nums1[mstart+k - 1];	
		}
		if(k==1){
			return Math.min(nums1[mstart], nums2[nstart]);
		}
		int aMid = mstart+k/2 - 1;
		int bMid = nstart+k/2 - 1;
		int aValue	= aMid < nums1.length?nums1[aMid]:Integer.MAX_VALUE;
		int bValue  = bMid < nums2.length?nums2[bMid]:Integer.MAX_VALUE;
		
		
		if(aValue <  bValue){	
			return findKth(k- k/2,nums1,aMid+1,nums2,nstart); 
		}else{
			return findKth(k- k/2,nums1,mstart,nums2,bMid+1);
		}
	}

}
