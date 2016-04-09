package Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Counting_Sheep {
	
	
	public static String Solution(long input){
		
		final long inp=input;
		
		LinkedList<Integer> in = new LinkedList<Integer>();
		for(int i = 0; i < 10; i++){
			in.add(i);	
		}
		int counter=1;
		String split;
		if(inp!=0)
		{
		while(true){
			
			System.out.println(inp*counter);
			
			LinkedList<Integer> linkedList = generator(inp*counter);
			deleteDups(linkedList);
			if(!linkedList.containsAll(in)){
				counter++;
			}
			else{
				break;
			}
		}
		return Long.toString(inp*counter);
		}else{
			return "INSOMNIA";
		}
		
	} 
	public static void deleteDups(LinkedList<Integer> list) {
        Set s = new HashSet<Integer>();
        s.addAll(list);
        list.clear();
        list.addAll(s);
    }
	public static LinkedList<Integer> generator(long number){	
		LinkedList<Integer> stack = new LinkedList<Integer>();
		while (number > 0) {
		    stack.push( (int) (number % 10) );
		    number = number / 10;
		}
		return stack;
	}
	public static void main(String args[]){	
		int input=1;
		System.out.print(Solution(input));
	}

}
