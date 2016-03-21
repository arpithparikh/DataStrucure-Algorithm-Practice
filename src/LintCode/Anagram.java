package LintCode;

import java.util.HashMap;
import java.util.Stack;

public class Anagram {
	
	 /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public static boolean anagram(String s, String t) {
        // write your code here
        
        HashMap<Character,Integer> hashMap=new HashMap<Character,Integer>();
        
        char array1[]=s.toCharArray();
        char array2[]=t.toCharArray();
        
        Stack<Character> stack =new Stack<Character>();
        
        for(int i=0;i<array1.length;i++)
        {
        	stack.push(array1[i]);
        }
        
        for(int i=0;i<array2.length;i++)
        {
        	char compare=stack.pop();
  
        	if(compare==array2[i])
        	{
        		return true;
        	}
        	
        }
        
        return false;
    }
	
	public static void main(String args[])
	{
		String s1="abcd";
		String s2="dcbe";
		
		System.out.println(anagram(s1, s2));
		
	}

}
