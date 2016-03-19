//Write method to replace all spaces in the string with '%20'.
//String in java is immutable , so we will use the character array.

package DataStructure.ArraysStrings;


public class ReplaceSpace {

	
	public static String Solution(char[] string , int length)
	{
		//precondition
		
		if(string==null || string.length==0)
		{
			return String.valueOf(string);
		}
		
		//Count the number spaces available in the string.
		int count =0;
		
		for(int i=0;i<length;i++)
		{
			if(string[i]==' ')
				
				count++;
		}
		
		//character array with the particular length.
		//length+ 2* space
		char[] res=new char[length+2*count];
		
		//new length
		int newLength=length +2*count;
		
		//simple logic
		//Start from back so you can expand the size
		for(int i = length-1;i>=0;i--)
		{
			//if the char is with white space then 
			if(string[i] == ' ')
			{
				res[newLength-1] = '0';
				res[newLength-2] = '2';
				res[newLength-3] = '%';
				newLength = newLength-3;
			}
			
			else{
				res[newLength-1] = string[i];
				newLength = newLength-1;
			}
		}
		return String.valueOf(res);
	}
	
}
