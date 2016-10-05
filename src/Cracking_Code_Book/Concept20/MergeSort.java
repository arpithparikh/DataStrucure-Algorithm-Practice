//Merge Sort
public class Solution{
	public static void mergeSort(int[] array){
		mergeSort(array,0,array.length - 1);
	}
	public static void mergeSort(int[] array,int leftStart, int rightEnd){
		if(leftStart < = rightEnd){
			return ;
		}
		int middle = (leftStart + rightEnd) /2;
		mergeSort(array,leftStart,middle);
		mergeSort(array,middle+1,rightEnd);
		mergeHalves(array,leftStart,rightEnd);
	}
	public static void mergeHalves(int[] array, int leftStart, int rightEnd){
		int leftEnd   = (rightEnd + leftStart) / 2;
		int leftStart = leftEnd + 1;
		int size 	  = rightEnd - leftStart + 1;
		int left      = leftStart;
		int right     = rightStart;
		int index 	  = leftStart;
		while(left < = leftEnd && right <= rightEnd){
			if(array[left] < = array[right]){
				temp[index] = array[left];
				index++;
				left++;
			}else{
				temp[index] = array[right];
				right++;
			}
				index++;
		}
		System.arraycopy(array,left,temp,index,leftEnd - left +1);
		System.arraycopy(array,right,temp,index,rightEnd- right+ 1);
		System.arraycopy(temp,leftStart,array,leftStart,size);
	}
}