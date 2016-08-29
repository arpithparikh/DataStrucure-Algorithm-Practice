package google_Interview_Practice.Array;

import java.util.HashMap;
import java.util.Stack;

//typical 
public class ValidParenteses {
	
	public static boolean isValid(String s){
		//HashMap
		//Keeping the opening parenthesis 
		HashMap<Character,Character> map = new HashMap<Character,Character>();
		map.put('(',')');
		map.put('[',']');
		map.put('{','}');
		
		//Defining the Stack
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < s.length();i++){
			char c = s.charAt(i);
			
			if(map.keySet().contains(c)){
				stack.push(c);
			}else if(map.values().contains(c)){
				if(!stack.empty() && map.get(stack.peek()) == c){
					stack.pop();
				}else{
					return false;
				}
			}
			
		}
		
		
		
		return false;
		
		
		
		
		
		
		
		
	}
	

}
