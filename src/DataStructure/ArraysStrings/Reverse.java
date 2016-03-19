package DataStructure.ArraysStrings;

//Reverse the given String

//Taking the string buffer to store the characters
//append each character from last to first by looping over the string

//time Complexity O(n)=>One for loop, space complexity O(n)
public class Reverse {
	
	public static String Solution(String str)
	{
		
		//Basic function append and Insert the  String
		StringBuffer res=new StringBuffer();
		
		//Precondition 
		if(str==null || str.length()==0)
		{
			return res.toString();
		}
		
		
		for(int i=0;i<str.length();i++)
		{
			
			
			res.append(str.charAt(str.length()-i-1));
			
			
			
			//Example : abc
			//which works liked below ... str.charAt(2) append with str.charAt(1).........
		}
		return res.toString();
		

	}
	
	
	//time complexity O(n),space O(1)
	//swapping
	public static String reverseString(String str)
	{
		//Precondition 
		if(str==null || str.length()==0)
		{
			return str;
		}
		
		char temp;
		for(int i =0; i<str.length()/2; i++)
		{
			/*
			//Temp variable i
			temp = str.charAt(i);
			
			//
			str.charAt(i) = str.charAt(str.length()-i);
			
			//
			str.charAt(str.length()-i) = temp;
		*/
			}
		return str;
	
		
		
	}
	
	public static void main(String[] args) {	
	
		String s = "abcadg";
		
		System.out.println(Solution(s)); 
	}

}
