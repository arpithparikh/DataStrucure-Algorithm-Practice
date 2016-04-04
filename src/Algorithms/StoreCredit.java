package Algorithms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StoreCredit {

	
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		
		//FileReader fileReader=new FileReader("C:\\Users\\arpitparikh\\Desktop\\A-small-practice .in");
		   
		   List<Integer> numbers = new ArrayList<>();
		   for (String line1 : Files.readAllLines(Paths.get("C:\\Users\\arpitparikh\\Desktop\\A-small-practice .in"))) {
		       for (String part : line1.split("\\s+")) {
		           Integer i = Integer.valueOf(part);
		           numbers.add(i);
		       }
		   }
		   //Number of Test Cases
		   int N=numbers.get(0);
		   System.out.println(numbers.get(0));
		   
		   
		   
		   
		  /* for (Integer integer : numbers) {
		
			   System.out.print(numbers);
		}*/
		   		
		   
		   int num=0;
		   
		for(int j=0;j<N;j++)
		{
				
				int target=numbers.get(j*3+1+num);
				 num=numbers.get(j*3+2+num-1);
				 
				
				System.out.println(num);
				  int[] targetInp=new int[num]; 
				
				for(int i=1;i<num;i++)
				{
					targetInp[i]=numbers.get(j*3+2+i);
				}
				
			//System.out.println(Arrays.toString(targetInp));
			
		}
		   
		   int[] targetInput = {2, 1, 9, 4 ,4 ,56, 90, 3};
	        int target = 8;
	     //  System.out.println(match(targetInput, target));
		   
		   
	}
	
	

public static Set<Integer> match(int A[],int total){
	
	int result[]=null;
	
	//Result Array
	ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
	
	
	Set<Integer> integers=new HashSet<Integer>();
	if(A.length==0 || A == null)
	{
		return integers;
	}
	
	ArrayList<Integer> list=new ArrayList<Integer>();
    Arrays.sort(A);  
	helper(res,list,A,0,total);

	
	for (List integer : res) {
		
		if (integer.size()==2) {
			
			for (Object object : integer) {
				
				for(int i=0;i<A.length;i++)
				{
					if(A[i]==Integer.parseInt(object.toString()))
					{
						integers.add(i);
					}
					
				}
				
			}
			
			
		}
		
		
	}
	
	
	return integers;

	
	
}
		

	private static void helper(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list, int[] A, int pos,int total) {
	// TODO Auto-generated method stub
		
		
		if(sum(list) ==total)
		{
		
			res.add(new ArrayList<Integer>(list));	
		}
		
		for(int i=pos;i<A.length;i++)
		{
			list.add(A[i]);
			helper(res, list, A, i+1,total);
			list.remove(list.size()-1);
		}
	
}

	
	private static int sum(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int j = 0; j < list.size(); j++)
		{
			sum=sum+list.get(j).intValue();
		}
		
		return sum;
	}
	
	
	
	
	
	
	public static int[] matchTotal(int[] input,int target)
	{
		
	
		 Map<Integer, Integer> targetMap = new HashMap<Integer, Integer>();
	        for(int i=0; i<input.length; i++){
	            targetMap.put(i,input[i]);
	            if(targetMap.containsKey(target - input[i])){
	                System.out.println("Test case: "+(target - input[i])+" , "+input[i]);
	            }
	        }
		
		
		
		
		return null;
		
	}
	
	
	
}
