package google_Interview_Practice.Array;

//Rotate Array!
public class RotateArray {
	
	
	public int [] RotateArray(int[] array,int k){
		
		if(k > array.length){
			k = k%array.length;
		}
		
		int[] result = new int[array.length];
		
		for(int i = 0;i < k; i++){
			
			result[i] = array[array.length - k+i ];
		}
		int j = 0;
		for(int i = k; i <array.length;i++){
			result[i] = array[j];
			j++;
		}
		
		System.arraycopy(result, 0, array, 0, array.length);
		
		
		return array;
		
	}

	//Reverse the Array , to rotate we could do two things , break the array into two part , make the first half and make it reverse and second half and make it reverse , then reverse entire array.
	public static void reverse(int[] array,int left, int right){
			if(array == null || array.length == 1){
				return 	;
				}
		while(left < right){
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right --;
				}
			}
		}
