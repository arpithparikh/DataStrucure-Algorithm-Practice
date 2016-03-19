//Given two strings, write a method to decide if one is a permutation of the other
//Comparison is case sensitive and whitespace is significant.
//is the string is having ASCII OR UNICODE UTF 8,16
//Example: "god"=>"dog"


package DataStructure.ArraysStrings;

import java.util.HashMap;

public class PermutationOfOther {

	
	public static boolean Solution(String str1,String str2)
	{
		//Character array
		if(str1 == null || str2 == null)
			return false;
		
		//Character array
		char[] str11 = str1.toCharArray();
		
		//Character array
		char[] str22 = str2.toCharArray();
		
		//precondition
		if(str11.length != str22.length)
			return false;
		
		//HashMap character and Integer
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		
		for(int i =0;i<str11.length;i++){
			
			//Keep the character inside the map.
			//Key->Data,value->the number of repeat of the same character in the String
			if(map.containsKey(str11[i])){
				
				
				map.put(str11[i],map.get(str11[i])+1);
			}
			else
				
				map.put(str11[i],1);
		}
		
		
		for(int i =0;i<str22.length;i++){
	
			if(map.containsKey(str22[i]))
			{
				map.put(str22[i], map.get(str22[i])-1);
			}
		}
		
		for(int i =0;i<str22.length;i++){
			
			//
			if(map.get(str22[i])!=0)
				
				return false;
		}
				return true;
	}
	
	public static void main(String s1[])
	{
		String S1="abcd";
		String S2="acdb";
		
		System.out.println(Solution(S1, S2));
				
	}

}
