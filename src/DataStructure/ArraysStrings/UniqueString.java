package DataStructure.ArraysStrings;

import java.util.Arrays;

//check the String has all Unique Characters?

//Is it ASCII or UniCode?
//ASCII->can fit into 8 bit->0 to 127-> 7-bit encoding,which map to numbers 0-127.
//UniCode->Can't fit into 8 bit(Its standardize like UTF-8,16)->Accommodate huge numbers of UniCod, and map to numbers 0-2^21.
//UTF 8- 8 bits and up to 48 bits ->0 and 127 are encoded with 8 bits, making it compatible with ASCII.
//UTF-16-16 bits wide->0 to 55295 are encoded with 16 bits.



public class UniqueString {
	
	//time complexity is O(n),//No additional Data Structure.
	public static boolean Solution(String str)
	{
		
		//Precondition if null, length <0 // Assuming the String Contains ASCII characters
		if(str==null||str.length()<0||str.length()>128)
		{
			return false;
		}
		
		//example:	String s1="abca@d";
		
		
		boolean[] check=new boolean[256];
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println(check[str.charAt(i)]);
			
			if(check[str.charAt(i)])
				
				return false;
			else
				check[str.charAt(i)]=true;
		}
				
		
		return true;
		
	}
	
	
	
	//TODO

/*	//Time complexity O(nlogn),sort first and then compare adjacent element to check whether they are same or not!
	public static boolean AdditionalSolution(String str)
	{
		
				//Precondition if null, length <0 // Assuming the String Contains ASCII characters
				if(str==null||str.length()<0||str.length()>128)
				{
					return false;
				}
				
				//converting into character array
				char[] res=str.toCharArray();
				
				//Sort using time sort, modified TimeSort in 1.7 ,O(n)< x < O(nlgn)
				
		
				
				for(int i=0;i<res.length;i++)
				{
					//Compare the adjacent Elements
					if(i!=res.length-1){
			            if(res[i]!=(res[i+1])){
			                return true;
			            }
			        }else {
			            return false;
			        }
				}
				
				return true;
				
				
				
		
	}*/
	
	public static void main(String args[])
	{
		
		
		//Example
		
		
		String s1="abc@d";
		
		System.out.println("Answer:"+" "+Solution(s1));
		/*System.out.println(AdditionalSolution(s1)+" "+AdditionalSolution(s2));*/
		
		
		
	}
}
