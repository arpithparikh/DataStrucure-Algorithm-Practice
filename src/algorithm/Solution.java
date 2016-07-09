package algorithm;

import java.util.Arrays;

class Solution{
	public static void main(String[] args){
		int[][] test = {{1,2,3},{5,0,4},{8,7,6}};
		int[] res = mergekSortedArrays(test);
		for(int i = 0; i < res.length; i++){
			System.out.print(res[i] + " ");
		}
		
		int [] input ={5,7,8,9,6};
		int [] output =mergeSort(input, 0, input.length);
		System.out.println("dsfsd"+Arrays.toString(output));
		
		}
	public static int[]  mergekSortedArrays(int[][] arrays) {
        // Write your code here
        int n = arrays.length;
        System.out.println(n);
        
        int m = arrays[n-1].length;
       
        int[] array = new int[n*m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                array[i*n + j] = arrays[i][j];
                System.out.print(array[i*n + j] + " ");   
            }   
        }
        System.out.println();
        //merge sort
        return mergeSort(array, 0, array.length);
    }
    public static int[] mergeSort(int[] array, int start, int end){
    	if(start == end){
    		return array;
    	}
	        int mid = (start + end-1)/2;
	    
	        int[] left = mergeSort(array, 0, mid);
	        int[] right = mergeSort(array, mid+1, end);
	        return mergeTwoArray(left,right); 	 
	        
    }
    public static int[] mergeTwoArray(int[] left, int[] right){
        
    
    	int m = left.length; int i = 0;
        int n = right.length; int j = 0;
        int k = 0;
        int[] res = new int[m + n];
        while(i < m && j< n){
        	if(left[i] < right[j]){
        		res[k] = left[i];
        		i++;
        	}else if(left[i] > right[j]){
        		res[k] = right[j];
        		j++;
        	}else{
        		
        		res[k] = left[i];
        	      i++;
        	      j++;
        	}
        	k++;
        	
        }
        while(i < m){
        	res[k] = left[i];
        	i++;
        	k++;
        }
        if(j < n){
        	res[k] = right[j];
        	j++;
        	k++;
        }
    
        return res;
       
    }
}