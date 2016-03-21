package LintCode;

import java.util.HashMap;
import java.util.Stack;

public class Anagram {
	
	 /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
  /*  public static boolean anagram(String s, String t) {
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
    
    */
    //changing the approach and try to work with the hash-code approach.
    
	//check whether is it Anagram or not!
    public static boolean isAnagram(final String s1,final String s2)
    {
    	//check error 
    	if(s1==null||s2==null||s1.length()!=s2.length())
    		return false;
    	
    	//
    	if(s1.equals(s2))
    		return true;
    	
  
    	final StringWrapper wrapper1=new StringWrapper(s1);
    	final StringWrapper wrapper2=new StringWrapper(s2);
    	
    	if(wrapper1.equals(wrapper2))
    		return true;
    
    	
    	
    	
    	return false;
    }
    
    static class StringWrapper
    {
    	String word;
    	
    	public StringWrapper(final String word)
    	{
    		this.word=word;
    	}
    	
    	public boolean equals(final Object obj)
    	{
    		//both object should be the same using the hash code.
			return hashCode()==obj.hashCode();	
    	}
    	
    	public int hashCode()
    	{
    		//to get the character array
    		final char[] array=word.toCharArray();
    		
    		//Initialize the hash-code
    		int hashcode=0;
    		
    		//creating hash-code 
    		for(final char c:array)
    		{
    			hashcode=hashcode+(c);
    			
    		}
    		return hashcode;
    	}
    }
    
	public static void main(String args[])
	{
		String s1="abcde";
		String s2="edcba";
		
		/*System.out.println(anagram(s1, s2));*/
		System.out.println(isAnagram(s1, s2));
		
	}

}
