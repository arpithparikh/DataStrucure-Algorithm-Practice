package Algorithms;

import java.util.*;

//Goal is to find and return the distinct pairs of Integers from array of Unique integers that sum to target value.

//My example: [2,5,8,7,6,3]  => target 9 will give two pairs

//Date : 3/17/2016

//@author:Arpit
public class Pairs {

	
	public static int CountPairs(int array[],int destination)
	{
		
		//Default condition if the array is null or the array's size is less than 2 then it will return 0.
		
		if(array==null || array.length<2)
		{
			return 0;
		}
		
		//No duplicates
		HashSet<Integer> hashset=new HashSet<Integer>();
		
		//which will count the pairs 
		int countPairs=0;
		
		//
		for(int i=0;i<array.length;i++)
		{
		
			//Check the hashSet Contains the pair or not!
			if(hashset.contains(destination-array[i]))
			{
				//It will increment the counter based on that!
				countPairs++;
			}
			else
			{
				hashset.add(array[i]);
			}
		}
		
		return countPairs;
		
	}
	
	public static void main(String args[])
	{
		//My example to test the result
		int array[]={2,5,8,7,6,3};
		int destination=9;
		
		System.out.print(CountPairs(array, destination));
	}
	
}
