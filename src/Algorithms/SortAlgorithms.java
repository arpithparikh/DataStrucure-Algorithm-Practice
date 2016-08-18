package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class SortAlgorithms {
	//Bucket Sort
	//Sorting Local Phone Number => i.e All phone number with Area code 412=>1 million Numbers
	//Create the Bit array of Size 10^7
	//Bucket sort can be exceptionally fast because of the way elements are assigned to buckets
	//n - Number of Elements , K- number of buckets
	//O(n^2), space -O(N+K)
	//
	public int[] BucketSort(int numbers[]){
		
		final int DEFAULT_BUCKET_SIZE = 5;
		
		if (numbers.length == 0 || numbers == null){
			return null;
		}
		//Determining the Max and Min Value
		Integer minValue = numbers[0];
		Integer maxValue = numbers[0];
		
	//sorting array	
		for (int i = 1; i < numbers.length; i++){
			
			if(numbers[i] < maxValue){
				minValue = numbers[i];
			}else if(numbers[i] > maxValue){
				maxValue = numbers[i];
			}
		}
		
		//
		int bucketCount = (maxValue - minValue) / DEFAULT_BUCKET_SIZE + 1;
        List<List<Integer>> buckets = new ArrayList<List<Integer>>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<Integer>());
        }

        // Distribute input array values into buckets
        for (int i = 0; i < numbers.length; i++) {
            buckets.get((numbers[i] - minValue) / DEFAULT_BUCKET_SIZE).add(numbers[i]);
        }

        // Sort buckets and place back into input array
        int currentIndex = 0;
        for (int i = 0; i < buckets.size(); i++) {
            Integer[] bucketArray = new Integer[buckets.get(i).size()];
            bucketArray = buckets.get(i).toArray(bucketArray);
           // InsertionSort.sort(bucketArray);
            for (int j = 0; j < bucketArray.length; j++) {
                numbers[currentIndex++] = bucketArray[j];
            }
        }
		return numbers;
		
		
	
	} 

	//Bubble Sort
	//“bubbles up” elements to their correct positions. This is done by iterating through the list multiple times, 
	//swapping elements with their neighbours if they are not in the correct order.
	//worst time complexity -> O(n^2), space Complexity -> O(1) Auxiliary array.
	
	//Could be faster -> 
	public int[] BubbleSort(int numbers[]){
		
		for(int i = 0; i<numbers.length-1; i++){
			for(int j = 1; j<numbers.length-i; j++){
				if (numbers[j-1] > numbers[j]){
					swap(numbers,j,j-1);
				}
			}
		}
		
		return numbers;
		
	} 
	private void swap(int[] numbers, int j, int i) {
		// TODO Auto-generated method stub
		
		int temp = numbers[j];
		numbers[j] = numbers[i];
		numbers[i] = temp;
	}

	//Insertion Sort
	//O(n^2) wort time , O(1) auxilary 
	//It is faster than most O(n \log n)O(nlogn) sorting algorithms for small lists.
	//It is very memory efficient requiring only O(1)O(1) auxiliary space for the single item that is being moved.
	//It is a stable sort; equal elements appear in the same order in the sorted list.
	//It is an adaptive sort; it’s fast when sorting mostly sorted lists or when adding items to an already sorted list.
	//It is really easy to implement.
	public static <T extends Comparable<T>>  void InsertionSort(T[] numbers){
		//first element already there in the sorted list
		for (int i = 1; i < numbers.length; i++) {
            T item = numbers[i]; 	// item , number in the sorted
            int indexHole = i; // // index -> unsorted portion  index
            //comparing the sorted and unsorted portion 
            //iterating from sorted portion from right to left
            while (indexHole > 0 && numbers[indexHole - 1].compareTo(item) > 0) {
                numbers[indexHole] = numbers[--indexHole]; //shifting each element we encounter one space to right
            }
            numbers[indexHole] = item;// inserting element in the sorted portion of the list.
        }
		
	} 
	
	//Selection Sort
	//last element is already sorted
	//o(n^2)
	public int[] SelectionSort(int numbers[]){
		
		
		for(int i = 0 ;i<numbers.length-1 ;i++){
			
			int min = i;
			
			for(int j = i + 1 ; j<numbers.length ;j++){
				
				if(numbers[j] < numbers[min]){
					min = j;//current element would be new minimum
				}
			}
			if(min!=i){
				swap(numbers,min,i);
			}
		}
		
		
		return numbers;
	} 
	//Heap Sort
	public int[] HeapSort(int numbers[]){
		
		
		
		
		return numbers;
		
	} 
	//Merge Sort
	public int[] MergeSort(int numbers[]){
		return numbers;
		
	} 
}
