import java.util.Arrays;
//Rotate_Array
public class RotateArray {
		//Rotate array
		public static int[] rotate(int[] array,int k){
			for(int i = 0 ; i < k;i++){ //its k 
				for(int j = array.length - 1 ; j > 0 ; j--){				
					int temp = array[j]; 
					array[j] = array[j -1];
					array[j - 1] = temp;
				}	
			}
		return array;
	}
		public static void main(String args[]){
			
			int[] array = {1,2,3,4,5,6,7};
			int k = 3;
			System.out.print(Arrays.toString(rotate(array, k)));		
		}

}
