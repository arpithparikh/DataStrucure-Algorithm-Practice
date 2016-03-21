//Ugly number is a number that only have factors 2, 3 and 5
//design an algorithm to find the nth ugly number. The first 10 ugly numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12...


package LintCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UglyNumber {
	
	//if n=9 it will return 10 ugly number.
	public static int Ugly(int n)
	{
		
		int count=0;
		
		List<Integer> list=new ArrayList<Integer>();
		
		//1 is factor of all values
		list.add(1);
		
		//starting with 2
		int value=2;
		while(n+1>count)
		{
			if(value%2==0 || value%3==0 ||value%5==0)
			{
				count++;
				list.add(value);
				value++;
			}
			
		}
		
		
		return list.get(n);
	}

	
	public static void main(String args[])
	{
		
		int n=9;
		System.out.println(+Ugly(n));
	
	}
}
