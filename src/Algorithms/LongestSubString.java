package Algorithms;
import java.util.HashSet;
import java.util.Set;
//Give "abcabcab" => abc'' longest Substring without Repeating Character 

public class LongestSubString {
	//Brute Force Approach => 
	public static int logestNonRepeat(String string){
		
		int length = 0;
		char [] given = string.toCharArray();
		Set<Character> set = new HashSet<Character>();
		int tempLength = -1;
		
		if(string==null || string.length() == 0)
			return 0;
		for(int i = 0 ; i < given.length; i++){
			length = 0;
			for(int j = i; j < given.length; j++)
			if (!set.contains(given[j])){
				set.add(given[j]);
				length++;
				System.out.println("n");
				
			}
			
			
			else{
				System.out.println(length);
			if (tempLength < length){
					tempLength = length;
			}
				set.clear();
				break;		
			}
		}
		if(length>tempLength){
			return length;
		}
		return tempLength;
	}
	
	public static void main(String args[]){
		
		String string= "pu";
		
		System.out.println(logestNonRepeat(string));
	}

}
