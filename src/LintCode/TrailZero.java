package LintCode;

public class TrailZero {
	
	//find the factorial using recursive solution.
	public static long fact(long n)
	{
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	
	}

	//Find the Solution
	public static long Solution(long n)
	{

		//factorial of the number
		long output=fact(n);
		
		//count the trailing zeros
		long counter=0;
		
		//Convert into String
		String output1=Long.toString(output);
		
		//loop around the trailing zeros otherwise break the condition.
		for(int i=output1.length()-1;i>0;i--)
		{
			
			if(output1.charAt(i)=='0')
			{
				counter++;
			}
			else
			{
				break;
			}
			
		}
		return counter;
	}
	public static void main(String args[])
	{
		//find the factorial of 11.
		long n= 11;
		
		System.out.println(Solution(n));
		//answer 2
	}
}
