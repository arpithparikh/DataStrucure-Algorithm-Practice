package Codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MinSum {
/*	public static int maxSubArray(int[] A) {
		int max = A[0];
		int[] sum = new int[A.length];
		sum[0] = A[0];
 
		
		for (int i = 1; i < A.length; i++) {
			
			
			if(sum[i]%2==0)
			{
			
			sum[i] = Math.min(A[i], sum[i - 1] + A[i]);
			max = Math.min(max, sum[i]);
			}
			
		}
 
		return max;
	}
*/
public static ArrayList<ArrayList<Integer>> minSum(int A[]){
	
	//Result Array
	ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
	
	
	if(A.length==0 || A == null)
	{
		return res;
	}
	
	ArrayList<Integer> list=new ArrayList<Integer>();
    Arrays.sort(A);  
	helper(res,list,A,0);
	System.out.println("The Minimum sum is "+ sum(res.get(0)));
	return res;
}
		

	private static void helper(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list, int[] A, int pos) {
	// TODO Auto-generated method stub
		//Min value initialization
		int min = -10000;
		
		if(sum(list) < min  || sum(list) > 0)
		{
			min = sum(list);
				
			res.remove(list);
			res.add(new ArrayList<Integer>(list));	
		}
		
		for(int i=pos;i<A.length;i++)
		{
			list.add(A[i]);
			helper(res, list, A, i+1);
			list.remove(list.size()-1);
		}
	
}

	private static int sum(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int j=0;j<list.size();j++)
		{
			sum=sum+list.get(j).intValue();
		}
		
		return sum;
	}


	public static void main(String args[])
	{
		int A[]={4,5,3,7,2};
		
		System.out.println(minSum(A));
		
	}
}
