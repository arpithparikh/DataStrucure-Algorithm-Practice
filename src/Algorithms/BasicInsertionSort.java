//Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
//For example: sort an arr[] of size n 
//Loop from i=1 to n-1
//The n=5 and arr[12,11,13,5,6]
//first iteration it will give 11,12,13,5,6
//So basically it swap between the adjacent elements in the whole array.
//start with key and check the adjacent elements and sort it through it.

//Complexity O(n^2)
//selection sort performs better than quick sort in case array to be
//sorted is small in size due to less computations and assignments


package Algorithms;

import java.util.Arrays;

public class BasicInsertionSort {
	
	public static int[] SortInsertion(int values[],int n)
	{
		
	//find the length of the array
		
		 n=values.length;
		
		 for(int i=1;i<values.length;i++)
		 {
			 //define key
			 int key=values[i];
			 //to loop over
			 int j=i-1;
			 
			 //Iterate over the while loop
			 while(j>=0 && values[j]>key)
			 {
				 values[j+1]=values[j];
				 j--;
			 }
			 
			 values[j+1]=key;
		 }
		
		
		return values;
	}
	
	
	//to test 
	
	public static void main(String args[])
	{
		
		int[] array={12,11,13,5,6};
	
		System.out.println(Arrays.toString(SortInsertion(array, array.length)));
		
		//Answer: [5, 6, 11, 12, 13]
	}
}
