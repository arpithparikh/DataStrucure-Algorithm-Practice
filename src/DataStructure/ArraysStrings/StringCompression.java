//Implement a method to perform basic string compression using the counts of repeated characters.
// For example, the string aaaabbbbddddeee->a4b4d4e3
//"Compressed the String"
package DataStructure.ArraysStrings;

public class StringCompression {

	public static String SolutionCompress(String str)
	{
		//User String Builder or String Buffer
		StringBuilder builder=new StringBuilder();
		
		//Convert the String into Character Array
		char[] str1=str.toCharArray();
		
		//initialize the char .
		char check=str1[0];
		
		//count
		int count=1;
		
		for(int i=0;i<str1.length;i++)
		{
			//
			if(str1[i]==check)
			{
				count++;
				
			}
			else
			{
			
				builder.append(check+"");
				builder.append(count);
				check=str1[i];
				count=1;
			}
		}
		
		if(builder.toString().length()>str.length())
		{
			return str;
			
		}
		else
		{
			return  builder.toString();
		}
		
	}
	

}
