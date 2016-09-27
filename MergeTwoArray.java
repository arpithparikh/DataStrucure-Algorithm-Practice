import java.util.Arrays;
public class MergeTwoArray {
	public static int[] mergetwoarray(int[] array1,int[] array2){
		int[] mergeArray = new int[array1.length + array2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while( i <= array1.length-1 && j <= array2.length-1){
			if(array1[i] < array2[j]){
				mergeArray[k] = array1[i];
				i++;
				k++;
			}else{
				mergeArray[k] = array2[j];
				j++;
				k++;
			}			
			if(i <= array1.length - 1 && j >= array2.length - 1){	
				mergeArray[k] = array1[i];
				i++;
				k++;		
			}
			if(j <= array2.length - 1 && i >= array1.length - 1){
				mergeArray[k] = array2[j];
				j++;
				k++;
			}
		}
		while(j <= array2.length -1){
			mergeArray[k] = array2[j];
			j++;
			k++;		
		}
		while(i <= array1.length -1){
			mergeArray[k] = array1[i];
			i++;
			k++;	
			
		}
	return mergeArray;
	}
	public static void main(String[] args){
		int[] array1 = {1,3,5,8,9,10};
		int[] array2 = {2,4,6,7};
		System.out.println(Arrays.toString(mergetwoarray(array1, array2)));		
	}

}
